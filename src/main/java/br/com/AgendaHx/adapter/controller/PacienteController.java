package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.mapper.PacienteMapper;
import br.com.AgendaHx.adapter.controller.request.PacienteRequest;
import br.com.AgendaHx.adapter.controller.response.PacienteResponse;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.CreatePacienteInputPort;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.FindAllPacienteInputPort;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.FindPacienteByIdInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private CreatePacienteInputPort createPacienteInputPort;

    @Autowired
    private FindAllPacienteInputPort seviceListAll;

    @Autowired
    private FindPacienteByIdInputPort serviceFindById;

    @Autowired
    private PacienteMapper mapper;

    @PostMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequest request) {
        PacienteDomain paciente = mapper.toPaciente(request);
        createPacienteInputPort.create(paciente);
        PacienteResponse pacienteResponse = mapper.toPacienteResponse(paciente);

        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteResponse);
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> listarTodos() {
        List<PacienteDomain> pacienteDomains = seviceListAll.findAll();
        List<PacienteResponse> pacienteResponses = mapper.toPacienteResponseList(pacienteDomains);
        return ResponseEntity.status(HttpStatus.OK).body(pacienteResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> buscaPorId(@PathVariable Long id) {
        Optional<PacienteDomain> optPaciente = Optional.ofNullable(serviceFindById.findById(id));

        if (optPaciente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        PacienteResponse pacienteResponse = mapper.toPacienteResponse(optPaciente.get());
        return ResponseEntity.status(HttpStatus.OK).body(pacienteResponse);
    }

}
