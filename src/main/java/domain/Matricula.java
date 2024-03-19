package domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_seq")
    @SequenceGenerator(name = "curso_seq", sequenceName = "sq_curso", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "codigo", length = 10, nullable = false, unique = true)
    private String codigo;

}
