package com.automation.remarks.testng.test;

import com.automation.remarks.video.annotations.Video;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by sergey on 18.06.16.
 */
public class TestNGXmlTest2 {

    @Test
    @Video
    public void testName() throws Exception {
        Thread.sleep(1000);
        assertTrue(true);
    }

    @Test
    @Video
    public void testName2() throws Exception {
        Thread.sleep(1000);
        assertTrue(false);
    }

    @Test
    @Video
    public void testName3() throws Exception {
        Thread.sleep(1000);
        assertTrue(true);
    }
}