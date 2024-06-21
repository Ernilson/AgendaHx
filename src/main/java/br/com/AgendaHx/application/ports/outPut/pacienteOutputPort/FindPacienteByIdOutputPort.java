package br.com.AgendaHx.application.ports.outPut.pacienteOutputPort;

import br.com.AgendaHx.application.core.domain.PacienteDomain;

import java.util.Optional;

public interface FindPacienteByIdOutputPort {

    Optional<PacienteDomain> findById(Long id);

}
