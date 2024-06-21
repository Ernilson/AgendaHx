package br.com.AgendaHx.adapter.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PacienteResponse {

    private long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String email;

}
