package br.com.AgendaHx.application.ports.inPut;

import br.com.AgendaHx.application.core.domain.PacienteDomain;

public interface CreatePacienteInputPort {
    void create(PacienteDomain pacienteDomain);
}
