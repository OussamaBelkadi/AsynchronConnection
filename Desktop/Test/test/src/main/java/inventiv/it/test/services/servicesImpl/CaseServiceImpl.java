package inventiv.it.test.services.servicesImpl;

import inventiv.it.test.dto.CaseDTO;
import inventiv.it.test.dto.CreationCaseDTO;
import inventiv.it.test.entities.Cases;
import inventiv.it.test.exceptions.NotExist;
import inventiv.it.test.mapper.CaseMapperImpl;
import inventiv.it.test.repository.CaseRepository;
import inventiv.it.test.services.CaseService;
import inventiv.it.test.services.Service;

import java.time.LocalDate;
import java.util.Optional;

@org.springframework.stereotype.Service
public class CaseServiceImpl implements CaseService, Service {
    private CaseRepository caseRepository;
    private CaseMapperImpl caseMapper;

    public CaseServiceImpl(CaseRepository caseRepository, CaseMapperImpl caseMapper){
        this.caseRepository = caseRepository;
        this.caseMapper = caseMapper;
    }


    @Override
    public CaseDTO getCase(long id) {
        Cases aCases = caseRepository.findById(id).orElseThrow(()-> new NotExist("this case is not exist"));
        return caseMapper.toDTO(aCases);
    }

    @Override
    public CaseDTO createCase(CreationCaseDTO caseDTO) {
        Cases aCases = caseMapper.createMapper(caseDTO);
        aCases.setLastUpdateDate(LocalDate.now());
        aCases =caseRepository.save(aCases);
        return caseMapper.toDTO(aCases);
    }

    @Override
    public CaseDTO updateCase(CaseDTO caseDTO, long id) {
        Cases aCases = caseMapper.updateMapper(caseDTO);
        Optional<Cases> caseOptional = caseRepository.findById(id);
        if (caseOptional.isPresent()) {
            aCases.setLastUpdateDate(LocalDate.now());
            aCases = caseRepository.save(aCases);
        }else throw new NotExist("this is case is not exist");
        return caseMapper.toDTO(aCases);
    }

    @Override
    public String deleteCase(long id) {
        String message;
        Optional<Cases> caseOptional = caseRepository.findById(id);
        if (caseOptional.isPresent()){
            caseRepository.deleteById(id);
            message = "Delete case successfully";
        }else throw new NotExist("this is case is not exist");
        return message;
    }
}
