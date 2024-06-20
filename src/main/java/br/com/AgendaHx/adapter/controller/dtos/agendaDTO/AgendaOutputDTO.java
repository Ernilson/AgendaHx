package br.com.AgendaHx.adapter.controller.dtos.agendaDTO;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaOutputDTO {
    private Long id;
    private String descricao;
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;

    private PacienteEntity paciente;
}
