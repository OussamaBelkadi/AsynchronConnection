package inventiv.it.test.mapper;

import inventiv.it.test.dto.CaseDTO;
import inventiv.it.test.dto.CreationCaseDTO;
import inventiv.it.test.entities.Cases;
import org.springframework.stereotype.Component;

@Component
public class CaseMapperImpl {

    public Cases createMapper(CreationCaseDTO caseDTO){
        Cases aCases = Cases.builder().creationDate(caseDTO.getCreationDate())
                        .title(caseDTO.getTitle())
                        .description(caseDTO.getDescription())
                        .build();
        return aCases;
    }

    public Cases updateMapper(CaseDTO caseDTO){
        Cases aCases = Cases.builder().id(caseDTO.getId())
                        .creationDate(caseDTO.getCreationDate())
                        .title(caseDTO.getTitle())
                        .description(caseDTO.getDescription())
                        .build();
        return aCases;
    }

    public CaseDTO toDTO(Cases aCases){
        CaseDTO caseDTO = CaseDTO.builder()
                             .id(aCases.getId())
                            .creationDate(aCases.getCreationDate())
                            .lastUpdateDate(aCases.getLastUpdateDate())
                            .title(aCases.getTitle())
                            .description(aCases.getDescription())
                                .build();
        return caseDTO;
    }


}
