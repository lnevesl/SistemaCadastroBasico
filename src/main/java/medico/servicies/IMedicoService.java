package medico.servicies;

import medico.Dto.CreateMedicoRequest;
import medico.Dto.MedicoDto;

import java.util.List;

public interface IMedicoService {

    void createMedico(CreateMedicoRequest createMedicoRequest);
    List<MedicoDto> listMedico();
}
