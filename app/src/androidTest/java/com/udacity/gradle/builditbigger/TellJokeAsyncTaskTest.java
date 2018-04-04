package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
//Refer http://marksunghunpark.blogspot.com.tr/2015/05/how-to-test-asynctask-in-android.html

// I preferred this method due to wanting to test asynctask in isolation rather than
// in conjunction with activity code.
// This method seems to be quite old and using deprecated code however it works just fine

@RunWith(AndroidJUnit4.class)
public class TellJokeAsyncTaskTest extends ApplicationTestCase<Application> {

    private CountDownLatch signal = null;

    private boolean jokeEmpty=true;

    public TellJokeAsyncTaskTest() {
        super(Application.class);
    }

    @Before
    public void before() {
        signal = new CountDownLatch(1);
    }

    @After
    public void after() {
        signal.countDown();
    }

    @Test
    public void verifyAsyncTaskRetrievesNonEmptyString() {
//        boolean jokeEmpty=true;
        TellJokeAsyncTask tellJokeAsyncTask = new TellJokeAsyncTask();
        tellJokeAsyncTask.setOnResultsListener(new TellJokeAsyncInterface() {
            public void onResultsSucceeded(String joke) {
                Log.d("DOUGLAS", "onResultsSucceeded: "+joke);
                jokeEmpty = (joke ==null || joke.isEmpty() ||
                        joke.contains("timed out") ||
                        joke.toLowerCase().contains("error".toLowerCase()) ||
                        joke.toLowerCase().contains("service unavailable".toLowerCase())
                );
                signal.countDown();
            }
        });

        tellJokeAsyncTask.execute();

        try {
            signal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertFalse(jokeEmpty);
    }
}