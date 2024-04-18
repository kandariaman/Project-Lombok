package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Beer;
import com.spring.learn.Springlearnlombok.model.BeerStyle;

import java.math.BigDecimal;
import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122).build();
    }
}