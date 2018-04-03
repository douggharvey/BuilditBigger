package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class TellJokeAsyncTaskTest {

    @Test
    public void verifyAsyncTaskRetrievesNonEmptyString() {
        TellJokeAsyncTask tellJokeAsyncTask = new TellJokeAsyncTask();
        tellJokeAsyncTask.setOnResultsListener(new TellJokeAsyncInterface() {
            public void onResultsSucceeded(String joke) {
                boolean jokeEmpty = (joke==null || joke.isEmpty());
                assertFalse(jokeEmpty);
            }
        });
        tellJokeAsyncTask.execute();
    }
}