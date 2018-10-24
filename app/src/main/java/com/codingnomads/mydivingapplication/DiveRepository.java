package com.codingnomads.mydivingapplication;

import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class DiveRepository {

    private String url = "http://192.168.0.102:8080/users/logbook/dives/";
    private RestTemplate restTemplate;

    public DiveRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Dive> getAllDives() {
        Dive[] diveList = restTemplate.getForObject(url, Dive[].class);
        return Arrays.asList(diveList);
    }
}
