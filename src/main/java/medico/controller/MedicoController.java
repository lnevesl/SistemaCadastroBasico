package medico.controller;


import lombok.AllArgsConstructor;
import medico.Dto.CreateMedicoRequest;
import medico.Dto.MedicoDto;
import medico.servicies.IMedicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class MedicoController {

    private final IMedicoService iMedicoService;

    @PostMapping
    public String createMedico(CreateMedicoRequest createMedicoRequest){

        if (createMedicoRequest.getNomeMedico() == null) {
            return "O campo Nome do Médico é obrigatório";
        }
        if (createMedicoRequest.getCrmMedico() == null){
            return "O campo do CRM do Médico é obrigatório";

        }
        iMedicoService.createMedico(createMedicoRequest);
        return "Médico Cadastrado com sucesso";

    }
    @GetMapping
    public List<MedicoDto> listMedico(){
        return iMedicoService.listMedico();


    }
}
