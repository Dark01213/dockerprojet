package com.ingnum.rentalservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class BonjourController {

    @GetMapping("/bonjour")
    public String bonjour() {
        return "bonjour";
    }

    private static final Logger logger = LoggerFactory.getLogger(BonjourController.class);
    @Value("${customer.service.url}")
    private String customerServiceUrl;

    @GetMapping("/customer/{name}")
    public String bonjourCustomer(@PathVariable String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = customerServiceUrl + "/index.php?name=" + name;
        logger.info("Requesting URL: " + url);
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
