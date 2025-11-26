package medico.servicies;

import medico.Dto.CreateClienteRequest;
import medico.Dto.CreateMedicoRequest;

public interface IMedicoService {

    void createmedico(CreateMedicoRequest createMedicoRequest);
}
