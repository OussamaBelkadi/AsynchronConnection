package inventiv.it.test.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
@Builder
public class CaseDTO {
    private Long id;

    private LocalDate creationDate;

    private LocalDate lastUpdateDate;

    private String title;

    private String description;
}
