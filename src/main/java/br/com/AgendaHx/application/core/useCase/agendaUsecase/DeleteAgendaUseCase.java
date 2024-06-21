package br.com.AgendaHx.application.core.useCase.agendaUsecase;

import br.com.AgendaHx.application.ports.inPut.agendaInputPort.DeleteAgendaInputPort;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.DeleteAgendaOutPutPort;

public class DeleteAgendaUseCase implements DeleteAgendaInputPort {

    private final DeleteAgendaOutPutPort deleteAgendaOutPutPort;

    public DeleteAgendaUseCase(DeleteAgendaOutPutPort deleteAgendaOutPutPort){
        this.deleteAgendaOutPutPort = deleteAgendaOutPutPort;
    }

    @Override
    public void deleteById(Long id) {
        deleteAgendaOutPutPort.deleteById(id);
    }
}
