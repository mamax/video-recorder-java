package com.automation.remarks.video.test;

import com.automation.remarks.video.annotations.Video;
import com.automation.remarks.video.junit.VideoRule;
import com.automation.remarks.video.recorder.VideoRecorder;
import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by sergey on 4/21/16.
 */
public class JUnitVideoRecording {

    public static final String VIDEO_FILE_NAME = "junit_test";

    @Rule
    public VideoRule videoRule = new VideoRule();

    @Test
    public void shouldPass() throws Exception {
        Thread.sleep(1000);
    }

    @Test(expected = AssertionFailedError.class)
    @Video(name = VIDEO_FILE_NAME)
    public void shouldBeAssertionFail() throws Exception {
        Thread.sleep(1000);
        assertTrue("Should fail", false);
    }

    @Test
    @Video(enabled = false)
    public void shouldPassWithoutVideo() throws Exception {
        Thread.sleep(1000);
    }

    @After
    public void afterTest() throws Exception {
        System.out.println("After test completed");
    }

    @AfterClass
    public static void shouldBeOneRecordedVideo() {
        ArrayList<String> lastVideoFiles = VideoRecorder.getAllRecordedTestNames();
        assertEquals(lastVideoFiles.size(), 2);
    }
}