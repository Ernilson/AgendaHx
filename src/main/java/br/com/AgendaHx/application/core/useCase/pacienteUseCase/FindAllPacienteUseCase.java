package br.com.AgendaHx.application.core.useCase.pacienteUseCase;

import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.FindAllPacienteInputPort;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.FindAllPacienteOutputPort;

import java.util.List;

public class FindAllPacienteUseCase implements FindAllPacienteInputPort {

    private final FindAllPacienteOutputPort findAllPacienteOutputPort;

    public FindAllPacienteUseCase(FindAllPacienteOutputPort findAllPacienteOutputPort){
        this.findAllPacienteOutputPort = findAllPacienteOutputPort;
    }

    @Override
    public List<PacienteDomain> findAll() {
        return findAllPacienteOutputPort.findAll();
    }
}
