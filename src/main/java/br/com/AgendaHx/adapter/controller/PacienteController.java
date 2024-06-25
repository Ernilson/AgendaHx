package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.mapper.PacienteMapper;
import br.com.AgendaHx.adapter.controller.request.PacienteRequest;
import br.com.AgendaHx.adapter.controller.response.PacienteResponse;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.CreatePacienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

//    @Autowired
//    private FindAllPacienteInputPort seviceList;

    @Autowired
    private PacienteMapper mapper;

    @PostMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequest request){
        PacienteDomain paciente = mapper.toPaciente(request);
        createPacienteInputPort.create(paciente);
        PacienteResponse pacienteResponse = mapper.toPacienteResponse(paciente);

        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteResponse);
    }

//    @GetMapping
//    public ResponseEntity<List<PacienteResponse>> listarTodos(){
//        List<PacienteDomain> pacienteDomains = serviceList.
//    }
}
