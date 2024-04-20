package com.spring.learn.Springlearnlombok.controller;

import com.spring.learn.Springlearnlombok.model.Beer;
import com.spring.learn.Springlearnlombok.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @RequestMapping(value = "/{beerId}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable UUID beerId) {

        log.debug("Get Beer by id - in controller");
        return beerService.getBeerById(beerId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> getBeerList() {
        return beerService.listBeers();
    }
}
