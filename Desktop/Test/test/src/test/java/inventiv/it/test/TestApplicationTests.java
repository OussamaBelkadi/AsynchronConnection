package inventiv.it.test;

import inventiv.it.test.dto.CaseDTO;
import inventiv.it.test.entities.Cases;
import inventiv.it.test.exceptions.NotExist;
import inventiv.it.test.mapper.CaseMapperImpl;
import inventiv.it.test.repository.CaseRepository;
import inventiv.it.test.services.servicesImpl.CaseServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
class TestApplicationTests {

    @Mock
    private CaseRepository caseRepository;

    @Mock
    private CaseMapperImpl caseMapper;

    @InjectMocks
    private CaseServiceImpl caseService;

    @Test
    public void testDeleteCase_Exists() {
        Cases aCase = new Cases();
        aCase.setId(1L);

        Mockito.when(caseRepository.findById(1L)).thenReturn(Optional.of(aCase));

        String result = caseService.deleteCase(1L);

        assertEquals("Delete case successfully", result);
        Mockito.verify(caseRepository, Mockito.times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteCase_NotExists() {
        Mockito.when(caseRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(NotExist.class, () -> caseService.deleteCase(1L));
    }

//
}
