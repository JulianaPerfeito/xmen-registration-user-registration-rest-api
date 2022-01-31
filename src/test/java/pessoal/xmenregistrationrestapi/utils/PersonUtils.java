package pessoal.xmenregistrationrestapi.utils;

import pessoal.xmenregistrationrestapi.dto.request.PersonDTO;
import pessoal.xmenregistrationrestapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String ALIAS = "ICEMAN";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .alias(ALIAS)
                .birthDate("04-04-2010")
                .powers(Collections.singletonList(PowerUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .alias(ALIAS)
                .birthDate(BIRTH_DATE)
                .powers(Collections.singletonList(PowerUtils.createFakeEntity()))
                .build();
    }

}
