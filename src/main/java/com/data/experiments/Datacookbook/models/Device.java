package com.data.experiments.Datacookbook.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Device {

    @Id
    @GeneratedValue
    private int id;

    private String deviceName;

    private String description;

    private Timestamp dateAdded;

    public Device(){

    }

    public Device(String deviceName, String description, Timestamp dateAdded) {
        this.id = id;
        this.deviceName = deviceName;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public Device(int id, String deviceName, String description, Timestamp dateAdded) {
        this.deviceName = deviceName;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "\nDevice{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
