package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
