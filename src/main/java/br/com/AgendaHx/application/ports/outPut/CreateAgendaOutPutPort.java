package br.com.AgendaHx.application.ports.outPut;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

public interface CreateAgendaOutPutPort {

    void createAgenda(AgendaDomain agendaDomain);
}
