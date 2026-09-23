package com.senai.backend.controller;

import com.senai.backend.model.SaaSInput;
import com.senai.backend.model.SaaSOutput;
import com.senai.backend.service.PricingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/simulador")
@CrossOrigin(origins = "http://localhost:4200")
public class PricingController {

    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @PostMapping("/calcular")
    public SaaSOutput calcular(@RequestBody SaaSInput input) {
        return pricingService.calcular(input);
    }
}