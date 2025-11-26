package medico.controller;


import lombok.AllArgsConstructor;
import medico.Dto.CreateClienteRequest;
import medico.Dto.CreateMedicoRequest;
import medico.servicies.IClienteService;
import medico.servicies.IMedicoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MedicoController {

    private final IMedicoService iClienteService;

    @PostMapping
    public String createMedico(CreateMedicoRequest createMedicoRequest){

        if (
                createMedicoRequest.getNomeMedico() == null) {
            return "O campo Nome do Médico é obrigatório";
        }
        if (createMedicoRequest.getCrmMedico() == null){
            return "O campo do CRM do Médico é obrigatório";

        }

        return "Médico Cadastrado com sucesso";

    }
}
