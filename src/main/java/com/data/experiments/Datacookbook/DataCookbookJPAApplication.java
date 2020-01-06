package com.data.experiments.Datacookbook;

import com.data.experiments.Datacookbook.models.Device;
import com.data.experiments.Datacookbook.repository.DeviceJPARepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class DataCookbookJPAApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(DataCookbookJPAApplication.class);

    @Autowired
    DeviceJPARepository deviceJPARepository;

    public static void main(String[] args) {
        SpringApplication.run(DataCookbookJPAApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Get device by  Id{}", deviceJPARepository.findById(123));
        logger.info("Update device{}", deviceJPARepository.insert(new Device("Drone","Pro",new Timestamp(System.currentTimeMillis()))));
        logger.info("Insert device{}", deviceJPARepository.update(new Device("Xbox","Pro",new Timestamp(System.currentTimeMillis()))));
        deviceJPARepository.delete(123);

    }
}
