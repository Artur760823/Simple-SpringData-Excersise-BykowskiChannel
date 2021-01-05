package com.zajaczek.springDataExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        Car car = new Car("Honda", "Jazz", Color.BLACK);
        carRepo.save(car);

//        Iterable<Car> all = carRepo.findAll();
//        all.forEach(System.out::println);
    }
}
