package com.example.tourereservation;

import com.example.tourereservation.entities.Reservation;
import com.example.tourereservation.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.ColumnMapRowMapper;

@SpringBootApplication
public class ToureReservationApplication {

	public static void main(String[] args) {

		SpringApplication.run(ToureReservationApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
		return  args -> {
			Reservation reservation = Reservation.builder()
					.ville("asfi")
					.regionId(1)
					.build();
			reservationRepository.save(reservation);
			Reservation reservation1 = Reservation.builder()
					.ville("Agadir")
					.regionId(2)
					.build();
			reservationRepository.save(reservation1);

			Reservation reservation2 = Reservation.builder()
					.ville("Rabat")
					.regionId(1)
					.build();
			reservationRepository.save(reservation2);

		};
	}
}
