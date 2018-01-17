package fi.iki.jka;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static junit.framework.TestCase.assertEquals;


public class JPhotoFrameTest {

    @Test
    public void doesStandardSlideshowStart() throws Exception {

        String[] photos = new String[1];
        photos[0] = "./tests/resources/Online-picture1.jpg";

        JPhotoCollection jPhotoCollection = new JPhotoCollection(photos);
        JPhotoFrame jPhotoFrame = new JPhotoFrame("", jPhotoCollection);
        jPhotoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPhotoFrame.actionPerformed(new ActionEvent("a",1,JPhotoMenu.A_SLIDESHOW));

        assertEquals(jPhotoFrame.interval,5000);
    }

}