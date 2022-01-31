package pessoal.xmenregistrationrestapi.utils;

import pessoal.xmenregistrationrestapi.dto.request.PowerDTO;
import pessoal.xmenregistrationrestapi.entity.Power;
import pessoal.xmenregistrationrestapi.enums.PowerLevel;
import pessoal.xmenregistrationrestapi.enums.PowerType;

public class PowerUtils {

    private static final String POWER= "Metamorph";
    private static final PowerType POWER_TYPE = PowerType.BODY_TRANSFORMATION;
    private static final PowerLevel POWER_LEVEL = PowerLevel.GAMA;
    private static final long PHONE_ID = 1L;

    public static PowerDTO createFakeDTO() {
        return PowerDTO.builder()
                .power(POWER)
                .type(POWER_TYPE)
                .level(POWER_LEVEL)
                .build();
    }

    public static Power createFakeEntity() {
        return Power.builder()
                .id(PHONE_ID)
                .power(POWER)
                .type(POWER_TYPE)
                .level(POWER_LEVEL)
                .build();
    }
}
