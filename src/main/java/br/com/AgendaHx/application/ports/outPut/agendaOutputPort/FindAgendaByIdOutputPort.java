package br.com.AgendaHx.application.ports.outPut.agendaOutputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

import java.util.Optional;

public interface FindAgendaByIdOutputPort {

    Optional<AgendaDomain> findById(Long id);
}
