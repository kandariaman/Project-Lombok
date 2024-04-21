package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();
    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);
}
