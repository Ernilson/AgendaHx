package br.com.AgendaHx.application.core.useCase.agendaUsecase;

import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.inPut.agendaInputPort.FindAllAgendaInputPort;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.FindAllAgendaOutputPort;

import java.util.List;

public class FindAllAgendaUseCase implements FindAllAgendaInputPort {

    private final FindAllAgendaOutputPort findAllAgendaOutputPort;

    public FindAllAgendaUseCase (FindAllAgendaOutputPort findAllAgendaOutputPort){
        this.findAllAgendaOutputPort = findAllAgendaOutputPort;
    }

    @Override
    public List<AgendaDomain> findAll() {
        return findAllAgendaOutputPort.findAll();
    }


}
