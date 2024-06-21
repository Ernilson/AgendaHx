package br.com.AgendaHx.application.ports.outPut.agendaOutputPort;

import br.com.AgendaHx.adapter.outPut.entities.AgendaEntity;
import br.com.AgendaHx.application.core.domain.AgendaDomain;

public interface CreateAgendaOutPutPort {

    void createAgenda(AgendaDomain agendaDomain);
}
