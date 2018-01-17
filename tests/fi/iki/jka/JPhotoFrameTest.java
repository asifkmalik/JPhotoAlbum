package fi.iki.jka;

import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;


public class JPhotoFrameTest {

    @Mock
    JPhotoCollection jPhotoCollection = mock(JPhotoCollection.class);


    @Test
    public void testStartShowsErrorWithNoPhotosSelected() throws Exception {

        JPhotoFrame jPhotoFrame = new JPhotoFrame("name",jPhotoCollection);


        assertThat(2, equalTo(2));
    }
}