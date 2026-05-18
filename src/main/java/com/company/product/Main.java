package com.company.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("This is INFO");
        logger.warn("This is WARN");
        logger.error("This is ERROR");
    }
}
