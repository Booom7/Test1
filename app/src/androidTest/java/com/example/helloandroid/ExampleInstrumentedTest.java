package com.example.helloandroid;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.helloandroid", appContext.getPackageName());
    }//Jonas war da
    //Jonas war gerade da via git 26.11.19 10:37
    //TEst2
    //Test 10:59
    //Test 11:18
    //Test 11:21
    //Test 11:23
    //Test Raffi  11:28
}
