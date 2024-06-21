package br.com.AgendaHx.application.ports.inPut.pacienteInputPort;

import br.com.AgendaHx.application.core.domain.PacienteDomain;

public interface CreatePacienteInputPort {
    void create(PacienteDomain pacienteDomain);
}
