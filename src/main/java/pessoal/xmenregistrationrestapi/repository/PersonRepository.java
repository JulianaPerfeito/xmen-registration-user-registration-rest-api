package pessoal.xmenregistrationrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pessoal.xmenregistrationrestapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
