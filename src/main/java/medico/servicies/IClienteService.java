package medico.servicies;

import medico.Dto.ClienteDto;
import medico.Dto.CreateClienteRequest;

import java.util.List;

public interface IClienteService {

    void createCliente(CreateClienteRequest createClienteRequest);
    List<ClienteDto> listCliente();
}
