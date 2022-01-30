package pessoal.xmenregistrationrestapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pessoal.xmenregistrationrestapi.enums.PowerLevel;
import pessoal.xmenregistrationrestapi.enums.PowerType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PowerDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PowerType type;

    @Enumerated(EnumType.STRING)
    private PowerLevel level;

    @NotEmpty
    @Size(min = 1, max = 100)
    private String power;
}
