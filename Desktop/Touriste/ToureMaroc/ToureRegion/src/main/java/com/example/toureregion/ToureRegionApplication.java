package com.example.toureregion;

import com.example.toureregion.config.ConfigClient;
import com.example.toureregion.entities.Region;
import com.example.toureregion.repositories.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.io.ObjectInputFilter;
import java.util.stream.Stream;

@SpringBootApplication
@EnableConfigurationProperties(ConfigClient.class)
public class ToureRegionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToureRegionApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(RegionRepository regionRepository){
        return args -> {
            Region region = Region.builder()
                    .ville("Safi")
                    .build();
            regionRepository.save(region);
            Region region2 = Region.builder()
                    .ville("Casablanca")
                    .build();
            regionRepository.save(region2);

        };
    }
}
