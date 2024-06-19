package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.CreateAgendaAdapter;
import br.com.AgendaHx.application.core.useCase.CreateAgendaUseCase;

public class AgendaConfig {

    public CreateAgendaUseCase createAgendaUseCase(CreateAgendaAdapter createAgendaAdapter){
        return new CreateAgendaUseCase(createAgendaAdapter);
    }
}
