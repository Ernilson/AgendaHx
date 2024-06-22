package br.com.AgendaHx.application.ports.inPut.pacienteInputPort;

import br.com.AgendaHx.application.core.domain.PacienteDomain;

import java.util.List;

public interface FindAllPacienteInputPort {
    public List<PacienteDomain> findAll();
}
