package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.douglasharvey.jokedisplay.JokeDisplayActivity;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        TellJokeAsyncTask tellJokeAsyncTask = new TellJokeAsyncTask();
        tellJokeAsyncTask.setOnResultsListener(new TellJokeAsyncInterface() {
            public void onResultsSucceeded(String joke) {
                Intent intent = new Intent(MainActivity.this, JokeDisplayActivity.class);
                intent.putExtra(getString(com.douglasharvey.jokedisplay.R.string.EXTRA_JOKE), joke);
                startActivity(intent);
            }
        });
        tellJokeAsyncTask.execute();
    }
}
