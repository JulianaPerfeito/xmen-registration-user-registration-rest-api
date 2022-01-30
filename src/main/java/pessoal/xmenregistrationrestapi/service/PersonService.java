package pessoal.xmenregistrationrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pessoal.xmenregistrationrestapi.dto.request.PersonDTO;
import pessoal.xmenregistrationrestapi.dto.response.MessageResponseDTO;
import pessoal.xmenregistrationrestapi.entity.Person;
import pessoal.xmenregistrationrestapi.mapper.PersonMapper;
import pessoal.xmenregistrationrestapi.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder()
                .message("Created X-men: " + savedPerson.getAlias())
                .build();
    }
}
