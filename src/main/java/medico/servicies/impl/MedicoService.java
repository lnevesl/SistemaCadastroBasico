package medico.servicies.impl;


import lombok.RequiredArgsConstructor;
import medico.Dto.CreateMedicoRequest;
import medico.Dto.MedicoDto;
import medico.persistence.entities.MedicoEntity;
import medico.persistence.repositories.MedicoRepository;
import medico.servicies.IMedicoService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.

public class MedicoService implements IMedicoService {

    private final MedicoRepository medicoRepository;
    private String te;

    @Override
    public void createMedico(CreateMedicoRequest createMedicoRequest) {

        var medicoEntity = new MedicoEntity();

        medicoEntity.setNomeMedico(createMedicoRequest.getNomeMedico());
        medicoEntity.setCrmMedico(createMedicoRequest.getCrmMedico());
        medicoRepository.save(medicoEntity);
    }

    @Override
    public List<MedicoDto> listMedico() {
        var medicoLista = medicoRepository.findAll()
                .stream()
                .map(medicoEntity -> {
                    var medicoDto = new MedicoDto();
                    medicoDto.setNomeMedico(medicoEntity.getNomeMedico());
                    medicoDto.setCrmMedico(medicoEntity.getCrmMedico());
                    return medicoDto;
                })
                .toList();

        return medicoLista;
    }

}
