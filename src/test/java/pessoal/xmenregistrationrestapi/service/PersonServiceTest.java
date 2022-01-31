package pessoal.xmenregistrationrestapi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pessoal.xmenregistrationrestapi.dto.request.PersonDTO;
import pessoal.xmenregistrationrestapi.dto.response.MessageResponseDTO;
import pessoal.xmenregistrationrestapi.entity.Person;
import pessoal.xmenregistrationrestapi.repository.PersonRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static pessoal.xmenregistrationrestapi.utils.PersonUtils.createFakeDTO;
import static pessoal.xmenregistrationrestapi.utils.PersonUtils.createFakeEntity;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSuccessSavedMessage() {
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSuccesMessage = createExpectedMessageResponse(expectedSavedPerson);

        MessageResponseDTO succesMessage = personService.createPerson(personDTO);

        assertEquals(expectedSuccesMessage, succesMessage);
    }

    private MessageResponseDTO createExpectedMessageResponse(Person expectedSavedPerson) {
        return MessageResponseDTO.builder()
                .message("Created X-men: " + expectedSavedPerson.getAlias())
                .build();
    }
}
