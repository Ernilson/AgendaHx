package br.com.AgendaHx.application.ports.outPut.pacienteOutputPort;

import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.core.domain.PacienteDomain;

import java.util.List;

public interface FindAllPacienteOutputPort {

    public List<PacienteDomain> findAll();
}
