package com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.cotroller;


import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.model.TrackingNumber;
import com.example.parceltrackingnumbergenerator.parceltrackingnumbergenerator.service.TrackingNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TrackingNumberController {

    @Autowired
    TrackingNumberService trackingNumberService;

    @GetMapping("/next-tracking-number")
    public Map<String, Object> getNextTrackingNumber(
            @RequestParam String origin_country_id,
            @RequestParam String destination_country_id,
            @RequestParam String weight,
            @RequestParam String created_at,
            @RequestParam String customer_id,
            @RequestParam String customer_name,
            @RequestParam String customer_slug) {

        TrackingNumber trackingNumber = trackingNumberService.generateTrackingNumber();
        Map<String, Object> response = new HashMap<>();
        response.put("tracking_number", trackingNumber.getTrackingNumber());
        response.put("created_at", trackingNumber.getCreatedAt().toString());
        return response;
    }

    @GetMapping("/hi")
    String hello(){
        return "Hello World";
    }
}