package pessoal.xmenregistrationrestapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PowerType {

    TRANSPORTATION("Transportation"),
    BODY_TRANSFORMATION("Body Transformation"),
    ENERGY_MANIPULATION("Energy Manipulation"),
    ELEMENTAL_ABILITY("Elemental Abilities"),
    SUPER_HUMAN_ATTRIBUTE("Super Human Attribute"),
    MENTAL_ABILITY("Mental Ability"),
    BONE_PROTRUSIONS("Bone Protrusions"),
    CONTACT_BASED_POWER("Contact Based Power"),
    UNIQUE_PHYSIOLOGY("Unique Physiology");

    private final String description;
}
