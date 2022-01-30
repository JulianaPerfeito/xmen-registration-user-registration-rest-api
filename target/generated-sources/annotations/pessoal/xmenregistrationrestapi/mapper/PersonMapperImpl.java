package pessoal.xmenregistrationrestapi.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pessoal.xmenregistrationrestapi.dto.request.PersonDTO;
import pessoal.xmenregistrationrestapi.dto.request.PersonDTO.PersonDTOBuilder;
import pessoal.xmenregistrationrestapi.dto.request.PowerDTO;
import pessoal.xmenregistrationrestapi.dto.request.PowerDTO.PowerDTOBuilder;
import pessoal.xmenregistrationrestapi.entity.Person;
import pessoal.xmenregistrationrestapi.entity.Person.PersonBuilder;
import pessoal.xmenregistrationrestapi.entity.Power;
import pessoal.xmenregistrationrestapi.entity.Power.PowerBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-30T16:16:20-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.13 (Ubuntu)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        PersonBuilder person = Person.builder();

        if ( personDTO.getBirthDate() != null ) {
            person.birthDate( LocalDate.parse( personDTO.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.id( personDTO.getId() );
        person.firstName( personDTO.getFirstName() );
        person.lastName( personDTO.getLastName() );
        person.alias( personDTO.getAlias() );
        person.powers( powerDTOListToPowerList( personDTO.getPowers() ) );

        return person.build();
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( person.getId() );
        personDTO.firstName( person.getFirstName() );
        personDTO.lastName( person.getLastName() );
        personDTO.alias( person.getAlias() );
        if ( person.getBirthDate() != null ) {
            personDTO.birthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( person.getBirthDate() ) );
        }
        personDTO.powers( powerListToPowerDTOList( person.getPowers() ) );

        return personDTO.build();
    }

    protected Power powerDTOToPower(PowerDTO powerDTO) {
        if ( powerDTO == null ) {
            return null;
        }

        PowerBuilder power = Power.builder();

        power.id( powerDTO.getId() );
        power.type( powerDTO.getType() );
        power.level( powerDTO.getLevel() );
        power.power( powerDTO.getPower() );

        return power.build();
    }

    protected List<Power> powerDTOListToPowerList(List<PowerDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Power> list1 = new ArrayList<Power>( list.size() );
        for ( PowerDTO powerDTO : list ) {
            list1.add( powerDTOToPower( powerDTO ) );
        }

        return list1;
    }

    protected PowerDTO powerToPowerDTO(Power power) {
        if ( power == null ) {
            return null;
        }

        PowerDTOBuilder powerDTO = PowerDTO.builder();

        powerDTO.id( power.getId() );
        powerDTO.type( power.getType() );
        powerDTO.level( power.getLevel() );
        powerDTO.power( power.getPower() );

        return powerDTO.build();
    }

    protected List<PowerDTO> powerListToPowerDTOList(List<Power> list) {
        if ( list == null ) {
            return null;
        }

        List<PowerDTO> list1 = new ArrayList<PowerDTO>( list.size() );
        for ( Power power : list ) {
            list1.add( powerToPowerDTO( power ) );
        }

        return list1;
    }
}
