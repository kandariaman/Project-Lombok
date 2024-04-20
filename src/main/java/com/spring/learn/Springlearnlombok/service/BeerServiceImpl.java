package com.spring.learn.Springlearnlombok.service;

import com.spring.learn.Springlearnlombok.model.Beer;
import com.spring.learn.Springlearnlombok.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;


@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {

        beerMap = new HashMap<>();

        Beer beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Beera")
                .beerStyle(BeerStyle.LAGER)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Budweiser")
                .beerStyle(BeerStyle.SAISON)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .build();

        beerMap.put(beer1.getId(),beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }


    @Override
    public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get Beer Id in service was called");
        return beerMap.get(id);
    }
}
