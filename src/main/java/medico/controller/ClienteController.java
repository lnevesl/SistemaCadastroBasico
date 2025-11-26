package medico.controller;

import lombok.RequiredArgsConstructor;
import medico.Dto.ClienteDto;
import medico.Dto.CreateClienteRequest;
import medico.servicies.IClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClienteController {

    private final IClienteService iClienteService;

    @PostMapping
    public String createCliente(CreateClienteRequest createClienteRequest){

        if (createClienteRequest.getNomeCliente() == null) {
            return "O campo Nome do Cliente é obrigatório";
        }
         if (createClienteRequest.getTelefoneCliente() == null){
                return "O campo do Telefone do Cliente é obrigatório";

         }

         iClienteService.createCliente(createClienteRequest);
         return "Cliente Cadastrado com sucesso";

    }
    @GetMapping
    public List<ClienteDto> listCliente(){
        return iClienteService.listCliente();


    }


}
