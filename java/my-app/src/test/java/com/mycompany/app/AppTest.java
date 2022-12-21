package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

        @Test
        public void getMessage() {
                String message = App.getMessage();
                assertEquals("Hello World!", message);
        }

        @Test
        public void getMessageWithName() {
                assertEquals("Hello BTS!", App.getMessage("BTS"));
                assertEquals("Hello BlackPink!", App.getMessage("BlackPink"));
        }
        
        @Test
        public void getMessageWithNull() {
                assertEquals("Hello Who are you!", App.getMessage(null));
        }

}
