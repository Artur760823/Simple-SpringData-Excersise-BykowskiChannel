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

        //add
        Car car1 = new Car("Honda", "Jazz", Color.BLACK);
        carRepo.save(car1);

        Car car2 = new Car("Audi", "A1", Color.RED);
        carRepo.save(car2);

        Car car3 = new Car("Honda", "Jazz", Color.BLUE);
        carRepo.save(car3);


        //read
//        Iterable<Car> all = carRepo.findAll();
//        all.forEach(System.out::println);


    }
}
