package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.dtos.pacienteDTO.PacienteInputDTO;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.CreatePacienteInputPort;
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
    public ResponseEntity<Void> create(@RequestBody PacienteInputDTO pacienteInputDTO){
        PacienteDomain paciente = mapper.map(pacienteInputDTO, PacienteDomain.class);
        createPacienteInputPort.create(paciente);
        return ResponseEntity.ok().build();
    }
}
