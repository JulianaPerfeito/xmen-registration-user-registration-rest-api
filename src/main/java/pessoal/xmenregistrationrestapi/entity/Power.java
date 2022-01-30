package pessoal.xmenregistrationrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pessoal.xmenregistrationrestapi.enums.PowerLevel;
import pessoal.xmenregistrationrestapi.enums.PowerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Power {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PowerType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PowerLevel level;

    @Column(nullable = false)
    private String power;
}
