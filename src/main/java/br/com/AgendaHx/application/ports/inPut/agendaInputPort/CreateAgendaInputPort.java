package br.com.AgendaHx.application.ports.inPut.agendaInputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

public interface CreateAgendaInputPort {
    void createAgenda(AgendaDomain agendaDomain);
}
