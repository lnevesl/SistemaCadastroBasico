package medico.servicies.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import medico.Dto.ClienteDto;
import medico.Dto.CreateClienteRequest;
import medico.persistence.entities.ClienteEntity;
import medico.persistence.repositories.ClienteRepository;
import medico.servicies.IClienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.

public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private String te;

    @Override
    public void createCliente(CreateClienteRequest createClienteRequest){

        var clienteEntity = new ClienteEntity();

        clienteEntity.setNomeCliente(createClienteRequest.getNomeCliente());
        clienteEntity.setTelefoneCliente(createClienteRequest.getTelefoneCliente());
        clienteRepository.save(clienteEntity);
    }

    @Override
    public List<ClienteDto> listCliente() {
      var clienteLista = clienteRepository.findAll()
              .stream()
              .map(clienteEntity -> {
                  var clienteDto = new ClienteDto();
                  clienteDto.setNomeCliente(clienteEntity.getNomeCliente());
                  clienteDto.setTelefoneCliente(clienteEntity.getTelefoneCliente());
                  return clienteDto;
              })
              .toList();

        return clienteLista;
    }


}
