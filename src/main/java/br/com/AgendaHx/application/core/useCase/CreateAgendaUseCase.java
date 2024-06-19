package br.com.AgendaHx.application.core.useCase;

import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.CreateAgendaInputPort;
import br.com.AgendaHx.application.ports.outPut.CreateAgendaOutPutPort;

public class CreateAgendaUseCase implements CreateAgendaInputPort {

    private CreateAgendaOutPutPort createAgendaOutPutPort;

    public CreateAgendaUseCase(CreateAgendaOutPutPort createAgendaOutPutPort){
        this.createAgendaOutPutPort = createAgendaOutPutPort;
    }

    @Override
    public void createAgenda(AgendaDomain agendaDomain) {

        createAgendaOutPutPort.createAgenda(agendaDomain);

    }
}
