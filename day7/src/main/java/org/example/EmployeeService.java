package org.example;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    void addEmployee(){
        logger.error("error");
        logger.warn("warning");
        logger.info("info");
        logger.debug("debug");
    }
}
