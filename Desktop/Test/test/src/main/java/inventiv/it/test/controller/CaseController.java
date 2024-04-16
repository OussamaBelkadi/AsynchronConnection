package inventiv.it.test.controller;

import inventiv.it.test.dto.CaseDTO;
import inventiv.it.test.dto.CreationCaseDTO;
import inventiv.it.test.services.CaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cases")
public class CaseController implements Controller{
    private final CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }


    @PostMapping("")
    public ResponseEntity createNewCase(@RequestBody CreationCaseDTO caseDTO){
        return ResponseEntity.ok(caseService.createCase(caseDTO));
    }
    @PutMapping("/{id}")
    public ResponseEntity updateCase(@RequestBody CaseDTO caseDTO, @PathVariable long id){
        return ResponseEntity.ok(caseService.updateCase(caseDTO,id));
    }

    @GetMapping("/{id}")
    public ResponseEntity getCase(@PathVariable long id){
        return ResponseEntity.ok(caseService.getCase(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCase(@PathVariable long id){
        return ResponseEntity.ok(caseService.deleteCase(id));
    }
}
