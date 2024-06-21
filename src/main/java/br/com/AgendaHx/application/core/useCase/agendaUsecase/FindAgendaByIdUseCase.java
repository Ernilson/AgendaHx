package br.com.AgendaHx.application.core.useCase.agendaUsecase;

import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.FindAgendaByIdInputPort;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.FindAgendaByIdOutputPort;

public class FindAgendaByIdUseCase implements FindAgendaByIdInputPort {

    private final FindAgendaByIdOutputPort findAgendaByIdOutputPort;

    public FindAgendaByIdUseCase(FindAgendaByIdOutputPort findAgendaByIdOutputPort){
        this.findAgendaByIdOutputPort = findAgendaByIdOutputPort;
    }

    @Override
    public AgendaDomain findById(Long id) {
        return findAgendaByIdOutputPort.findById(id).orElseThrow(
                () -> new RuntimeException("Essa agenda não foi encontrada"+ id)
        );
    }
}
