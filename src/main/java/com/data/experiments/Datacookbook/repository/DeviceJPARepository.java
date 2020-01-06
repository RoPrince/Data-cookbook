package com.data.experiments.Datacookbook.repository;

import com.data.experiments.Datacookbook.models.Device;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DeviceJPARepository {

    @PersistenceContext
    EntityManager entityManager;

    public Device findById(int id){
        return entityManager.find(Device.class,id);
    }

    public Device update(Device device){
        return entityManager.merge(device);
    }

    public Device insert(Device device){
        return entityManager.merge(device);
    }

    public void delete(int id){
        Device device = findById(id);
        entityManager.remove(device);
    }


}
