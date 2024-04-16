package inventiv.it.test.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Builder @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Cases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate lastUpdateDate;

    @Column(length = 250)
    private String title;

    @Column(length = 2056)
    private String description;

}
