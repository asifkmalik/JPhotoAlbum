package fi.iki.jka;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static junit.framework.TestCase.assertEquals;


public class JPhotoFrameTest {

    int expectedInterval;

    @Test
    public void doesStandardSlideshowStart() throws Exception {

        JPhotoFrame jPhotoFrame = new JPhotoFrame(){

            @Override
            public void getSlideShow(int interval) {
                expectedInterval = interval;
            }

            @Override
            public void setTitle() {

            }
        };

        jPhotoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPhotoFrame.actionPerformed(new ActionEvent("a",1,JPhotoMenu.A_SLIDESHOW));

        assertEquals(expectedInterval,5000);
    }


    @Test
    public void doesFastSlideshowStart() throws Exception {

        JPhotoFrame jPhotoFrame = new JPhotoFrame(){

            @Override
            public void getSlideShow(int interval) {
                expectedInterval = interval;
            }

            @Override
            public void setTitle() {

            }
        };

        jPhotoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPhotoFrame.actionPerformed(new ActionEvent("a",1,JPhotoMenu.A__FAST_SLIDESHOW));

        assertEquals(expectedInterval,2000);
    }
}