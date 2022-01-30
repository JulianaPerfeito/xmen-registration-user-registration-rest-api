package pessoal.xmenregistrationrestapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PowerLevel {

    UNKNOWN("Unknown"),
    EPSILON("Epsilon"),
    DELTA("Delta"),
    GAMA("Gama"),
    BETA("Beta"),
    ALPHA("Alpha"),
    OMEGA("Omega");

    private final String description;
}
