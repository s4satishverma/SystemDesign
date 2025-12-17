
package com.demo.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public String createOrder() {
        log.info("Order request received");
        String response = restTemplate.getForObject("http://localhost:8082/payments", String.class);
        log.info("Payment service response received");
        return "Order placed -> " + response;
    }
}
