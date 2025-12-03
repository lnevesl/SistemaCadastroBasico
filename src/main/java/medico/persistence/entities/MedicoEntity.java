package medico.persistence.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_medico" , schema = "public")
public class MedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "medico_Id", nullable = false)
    private Long medicoId;

    @Setter
    @Getter
    @Column(name = "nome_Medico", nullable = false)
    private String nomeMedico;

    @Setter
    @Getter
    @Column(name = "telefone_Cliente", nullable = false)
    private String crmMedico;

}
