package br.com.AgendaHx.application.ports.outPut.agendaOutputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

import java.util.List;

public interface FindAllAgendaOutputPort {

    public List<AgendaDomain> findAll();
}
