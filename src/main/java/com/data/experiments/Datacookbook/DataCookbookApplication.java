package com.data.experiments.Datacookbook;

import com.data.experiments.Datacookbook.repository.DeviceJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataCookbookApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(DataCookbookApplication.class);

    @Autowired
    DeviceJdbcDao deviceJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(DataCookbookApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All devices {}", deviceJdbcDao.findAll());
        logger.info("Device Id {}", deviceJdbcDao.findById(456));
    }
}
