package br.com.AgendaHx.adapter.controller.dtos.pacienteDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteInputDTO {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String email;
}
