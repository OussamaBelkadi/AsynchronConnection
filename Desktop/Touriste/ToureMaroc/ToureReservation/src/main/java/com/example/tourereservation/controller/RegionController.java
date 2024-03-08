package com.example.tourereservation.controller;

import com.example.tourereservation.entities.Reservation;
import com.example.tourereservation.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {
    private ReservationRepository reservationRepository;

    public RegionController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    @GetMapping("/reserve")
    public List<Reservation> listReservation(){
        return reservationRepository.findAll();
    }
    @GetMapping("/reserve/{id}")
    public Reservation reservationById(@PathVariable int id){
        return  reservationRepository.findById(id).get();
    }
}
