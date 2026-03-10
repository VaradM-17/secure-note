package com.varad.secure.notes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesApplication {
    private static Logger logger = LoggerFactory.getLogger(NotesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NotesApplication.class, args);
        logger.info("Application Started");
	}

}
