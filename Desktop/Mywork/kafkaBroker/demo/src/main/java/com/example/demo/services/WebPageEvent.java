package com.example.demo.services;

import com.example.demo.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Service
public class WebPageEvent {
    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("*************************");
            System.out.println(input.toString());
            System.out.println("*************************");
        };
    }

    @Bean
    public Supplier<PageEvent> pageEventSupplier() {
        return () -> new PageEvent("os", "U1", new Date());
    }

}
