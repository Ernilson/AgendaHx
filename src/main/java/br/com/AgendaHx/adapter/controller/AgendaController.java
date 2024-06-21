package br.com.AgendaHx.adapter.controller;

import br.com.AgendaHx.adapter.controller.request.AgendaRequest;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.CreateAgendaInputPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    private final CreateAgendaInputPort agendaInputPort;
    private final ModelMapper mapper;

    @Autowired
    public AgendaController(CreateAgendaInputPort agendaInputPort,
                            ModelMapper mapper ){
        this.agendaInputPort = agendaInputPort;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<Void> createAgenda(@RequestBody AgendaRequest agendaInputDTO){
        var agenda = mapper.map(agendaInputDTO, AgendaDomain.class);
        agendaInputPort.createAgenda(agenda);
        return ResponseEntity.ok().build();
    }
}
