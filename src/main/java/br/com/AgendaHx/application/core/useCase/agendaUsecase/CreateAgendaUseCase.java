package br.com.AgendaHx.application.core.useCase.agendaUsecase;

import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.CreateAgendaInputPort;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.CreateAgendaOutPutPort;

public class CreateAgendaUseCase implements CreateAgendaInputPort {

    private final CreateAgendaOutPutPort createAgendaOutPutPort;

    public CreateAgendaUseCase(CreateAgendaOutPutPort createAgendaOutPutPort){
        this.createAgendaOutPutPort = createAgendaOutPutPort;
    }

    @Override
    public void createAgenda(AgendaDomain agendaDomain) {

        createAgendaOutPutPort.createAgenda(agendaDomain);

    }
}
