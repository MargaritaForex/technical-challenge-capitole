package com.technical.challenge.infrastructure.rest.controller;

import com.technical.challenge.infrastructure.rest.dto.Costdto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CostController {

    @GetMapping("/cost/{productId}/{brandId}, {date}")
    public Costdto getProduct(@PathVariable Long productId,
                              @PathVariable Long brandId,
                              @PathVariable LocalDateTime date) {
       Costdto response = new Costdto();

        return response;
    }

}
