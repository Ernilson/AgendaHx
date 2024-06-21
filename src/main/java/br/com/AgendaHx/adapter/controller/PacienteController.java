package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.request.PacienteRequest;
import br.com.AgendaHx.adapter.controller.response.PacienteResponse;
import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.CreatePacienteInputPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private CreatePacienteInputPort createPacienteInputPort;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequest request){
        PacienteDomain paciente = mapper.map(request, PacienteDomain.class);
        createPacienteInputPort.create(paciente);
        return ResponseEntity.ok().build();
    }
}
