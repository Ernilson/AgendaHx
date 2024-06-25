package br.com.AgendaHx.adapter.controller.mapper;

import br.com.AgendaHx.adapter.controller.request.PacienteRequest;
import br.com.AgendaHx.adapter.controller.response.PacienteResponse;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PacienteMapper {

    private final ModelMapper mapper;

    public PacienteMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public PacienteDomain toPaciente(PacienteRequest request) {
        return mapper.map(request, PacienteDomain.class);
    }

    public PacienteResponse toPacienteResponse(PacienteDomain paciente) {
        return mapper.map(paciente, PacienteResponse.class);
    }

    public List<PacienteResponse> toPacienteResponseList(List<PacienteDomain> pacientes) {
        return pacientes.stream()
                .map(this::toPacienteResponse)
                .collect(Collectors.toList());
    }
}
