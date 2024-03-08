package com.example.tourereservation.repositories;


import com.example.tourereservation.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
