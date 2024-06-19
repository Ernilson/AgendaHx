package br.com.AgendaHx.application.ports.outPut;

import br.com.AgendaHx.application.core.domain.PacienteDomain;

public interface CreatePacienteOutPutPort {

    void insert(PacienteDomain pacienteDomain);
}
