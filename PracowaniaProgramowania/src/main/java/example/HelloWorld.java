package example;

import org.apache.log4j.Logger;

public class HelloWorld {

    final static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String [ ] args) {
        System.out.println("Hello World1");

        logger.info("To już drugie zajęcia");
    }
}

