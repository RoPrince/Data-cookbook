package com.data.experiments.Datacookbook.repository;

import com.data.experiments.Datacookbook.models.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeviceJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Device> findAll() {
        return jdbcTemplate.query("select * from device", new BeanPropertyRowMapper<>(Device.class));
    }

    public Device findById(int id) {
        return jdbcTemplate.queryForObject("select * from device where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Device.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from device where id =?", new Object[]{id});
    }
}
