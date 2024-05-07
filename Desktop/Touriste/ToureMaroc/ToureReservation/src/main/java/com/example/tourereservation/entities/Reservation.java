package com.example.tourereservation.entities;

import com.example.tourereservation.model.Region;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ville;
    private int regionId;
    @Transient
    private Region region;
 }
