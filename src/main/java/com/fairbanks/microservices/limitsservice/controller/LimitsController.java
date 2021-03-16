package com.fairbanks.microservices.limitsservice.controller;

import com.fairbanks.microservices.limitsservice.Configuration;
import com.fairbanks.microservices.limitsservice.model.Limits;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LimitsController {
    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
