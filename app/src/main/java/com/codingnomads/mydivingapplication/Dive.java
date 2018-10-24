package com.codingnomads.mydivingapplication;

public class Dive {
    private Integer id;
    private String name;
    private String date;
    private String location;
    private Double durationInMinutes;
    private Double maxDepthInMeters;
    private String waterCondition;
    private Boolean safetyStop;

    public Dive() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public Double getMaxDepthInMeters() {
        return maxDepthInMeters;
    }

    public void setMaxDepthInMeters(Double maxDepthInMeters) {
        this.maxDepthInMeters = maxDepthInMeters;
    }

    public String getWaterCondition() {
        return waterCondition;
    }

    public void setWaterCondition(String waterCondition) {
        this.waterCondition = waterCondition;
    }

    public Boolean getSafetyStop() {
        return safetyStop;
    }

    public void setSafetyStop(Boolean safetyStop) {
        this.safetyStop = safetyStop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dive{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", maxDepthInMeters=" + maxDepthInMeters +
                ", waterCondition='" + waterCondition + '\'' +
                ", safetyStop=" + safetyStop +
                '}';
    }
}
