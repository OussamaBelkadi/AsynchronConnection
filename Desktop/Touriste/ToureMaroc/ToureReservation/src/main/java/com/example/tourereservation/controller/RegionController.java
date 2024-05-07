package com.example.tourereservation.controller;

import com.example.tourereservation.clients.RegionRestClient;
import com.example.tourereservation.entities.Reservation;
import com.example.tourereservation.model.Region;
import com.example.tourereservation.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {
    private ReservationRepository reservationRepository;
    private RegionRestClient regionRestClient;

    public RegionController(ReservationRepository reservationRepository, RegionRestClient regionRestClient) {
        this.reservationRepository = reservationRepository;
        this.regionRestClient = regionRestClient;
    }


    @GetMapping("/reserve")
    public List<Reservation> listReservation(){
        return reservationRepository.findAll();
    }
    @GetMapping("/reserve/{id}")
    public Reservation reservationById(@PathVariable int id){
        Reservation reservation = reservationRepository.findById(id).get();
        Region region = regionRestClient.findRegionById(reservation.getId());
        reservation.setRegion(region);
        return reservation;
    }
}
