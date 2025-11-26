package medico.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateMedicoRequest {

    private String nomeMedico;
    private String crmMedico;


}
