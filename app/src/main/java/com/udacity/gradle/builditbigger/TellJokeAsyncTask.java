package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;
//Implemented code as per https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/77e9910911d5412e5efede5fa681ec105a0f02ad/HelloEndpoints#2-connecting-your-android-app-to-the-backend
class TellJokeAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;
    //private Context context;
    private TellJokeAsyncInterface listener;
    // implemented re-usable asynctask as per  https://philsandroidblog.wordpress.com/2013/02/05/creating-a-reusable-asynctask-in-android/
    public void setOnResultsListener(TellJokeAsyncInterface listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(Void ...voids) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
//NOTE: THIS CODE ONLY WORKS FOR AN EMULATOR, DEVICE REQUIRES ADDITIONAL CODE AND CONFIGURATION
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @SuppressWarnings("RedundantThrows")
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        try {
            Log.d("DOUGLAS", "doInBackground: calling return");
            return myApiService.getRandomJoke().execute().getData();

        } catch (IOException e) {
            Log.d("DOUGLAS", "IO exception");
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Log.d("DOUGLAS", "ONpOSTEXEC: " +result);
        listener.onResultsSucceeded(result);
    }
}
