package inventiv.it.test.repository;

import inventiv.it.test.entities.Cases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Cases, Long> {
}
