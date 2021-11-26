package by.epam.http;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.error("first log");
        logger.info("first info log");


    }

}
