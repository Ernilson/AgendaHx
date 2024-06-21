package br.com.AgendaHx.adapter.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequest {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String email;
}
