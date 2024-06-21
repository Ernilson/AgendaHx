package br.com.AgendaHx.application.ports.inPut.agendaInputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

import java.util.List;

public interface FindAllAgendaInputPort {
    public List<AgendaDomain> findAll();
}
