package com.technical.challenge.infrastructure.rest.controller;

import com.technical.challenge.infrastructure.rest.dto.CostDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
@RestController
@RequestMapping("cost")
public class CostController {

    @RequestMapping("/{productId}/{brandId}/{date}")
    public CostDto getProduct(@PathVariable("productId") Long productId,
                              @PathVariable("brandId") Long brandId,
                              @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  LocalDateTime  date) {

        return CostDto.builder()
                .applicationDte(date)
                .build();
    }

}
