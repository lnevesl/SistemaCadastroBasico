package medico.servicies.impl;


import lombok.AllArgsConstructor;
import medico.Dto.CreateMedicoRequest;
import medico.persistence.entities.MedicoEntity;
import medico.persistence.repositories.MedicoRepository;
import medico.servicies.IMedicoService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class MedicoService implements IMedicoService {

    private final MedicoRepository medicoRepository;

    @Override
    public void createmedico(CreateMedicoRequest createMedicoRequest){

        var medicoEntity = new MedicoEntity();

        medicoEntity.setNomeMedico(createMedicoRequest.getNomeMedico());
        medicoEntity.setCrmMedico(createMedicoRequest.getCrmMedico());

    }

}
