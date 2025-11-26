package medico.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateClienteRequest {

   private String nomeCliente;
   private String telefoneCliente;

}
