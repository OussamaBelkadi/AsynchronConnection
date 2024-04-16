package inventiv.it.test.services;

import inventiv.it.test.dto.CaseDTO;
import inventiv.it.test.dto.CreationCaseDTO;

public interface CaseService {
    CaseDTO getCase(long id);

    CaseDTO createCase(CreationCaseDTO caseDTO);
    CaseDTO updateCase(CaseDTO caseDTO, long id);
    String deleteCase(long id);
}
