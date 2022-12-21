package com.mycompany.app;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
        private static final Logger LOG = Logger.getGlobal();
        
        public static void main(String[] args) {
                String message = getMessage();
                LOG.info(message);
        }

        public static String getMessage() {
                return getMessage("World");
        }

        public static String getMessage(String name) {
                if (name == null) {
                        name = "Who are you";
                }
                return "Hello " + name + "!";
        }
}
