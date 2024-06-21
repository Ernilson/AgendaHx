package br.com.AgendaHx.application.ports.inPut.pacienteInputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;

import java.util.List;

public interface FindAllPacienteInputPort {
    public List<AgendaDomain> findAll();
}
