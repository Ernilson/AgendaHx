package br.com.AgendaHx.adapter.controller.request;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.adapter.utils.CustomLocalDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaRequest {
    private String descricao;
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;

    private PacienteEntity paciente;
}
