package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.mapper.AgendaMapper;
import br.com.AgendaHx.adapter.controller.request.AgendaRequest;
import br.com.AgendaHx.adapter.controller.response.AgendaResponse;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.CreateAgendaInputPort;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.FindAgendaByIdInputPort;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.FindAllAgendaInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    private final CreateAgendaInputPort agendaInputPort;
    private final FindAllAgendaInputPort serviceFindall;
    private final FindAgendaByIdInputPort serviceFindById;
    private final AgendaMapper mapper;


    @Autowired
    public AgendaController(CreateAgendaInputPort agendaInputPort,
                            FindAllAgendaInputPort serviceFindall,
                            FindAgendaByIdInputPort serviceFindById,
                            AgendaMapper mapper) {
        this.agendaInputPort = agendaInputPort;
        this.serviceFindall = serviceFindall;
        this.serviceFindById = serviceFindById;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<AgendaResponse> createAgenda(@RequestBody AgendaRequest request) {
        var agenda = mapper.toAgendaDomain(request);
        agendaInputPort.createAgenda(agenda);
        AgendaResponse agendaResponse = mapper.toAgendaResponse(agenda);
        return ResponseEntity.status(HttpStatus.CREATED).body(agendaResponse);
    }

    @GetMapping
    public ResponseEntity<List<AgendaResponse>> listarTodos() {
        List<AgendaDomain> agendaDomainList = serviceFindall.findAll();
        List<AgendaResponse> agendaResponses = mapper.toAgendaResponseList(agendaDomainList);
        return ResponseEntity.status(HttpStatus.OK).body(agendaResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity<AgendaResponse> buscarAgendaPorId(@PathVariable Long id) {
        Optional<AgendaDomain> optionalAgendaDomain = Optional.ofNullable(serviceFindById.findById(id));
        if (optionalAgendaDomain.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        AgendaResponse agendaResponse = mapper.toAgendaResponse(optionalAgendaDomain.get());
        return ResponseEntity.status(HttpStatus.OK).body(agendaResponse);
    }


}
