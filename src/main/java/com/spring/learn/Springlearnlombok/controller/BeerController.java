package com.spring.learn.Springlearnlombok.controller;

import com.spring.learn.Springlearnlombok.model.Beer;
import com.spring.learn.Springlearnlombok.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    public Beer getBeerById(UUID id) {

        log.debug("Get Beer by id - in controller");
        return beerService.getBeerById(id);
    }
}
