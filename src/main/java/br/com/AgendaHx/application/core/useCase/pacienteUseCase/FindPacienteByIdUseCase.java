package br.com.AgendaHx.application.core.useCase.pacienteUseCase;

import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.FindPacienteByIdInputPort;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.FindPacienteByIdOutputPort;

public class FindPacienteByIdUseCase implements FindPacienteByIdInputPort {

    private final FindPacienteByIdOutputPort findPacienteByIdOutputPort;

    public FindPacienteByIdUseCase(FindPacienteByIdOutputPort findPacienteByIdOutputPort){
       this.findPacienteByIdOutputPort = findPacienteByIdOutputPort;
    }

    @Override
    public PacienteDomain findById(Long id) {
        return findPacienteByIdOutputPort.findById(id).orElseThrow(
                ()-> new RuntimeException("Esse Paciente não foi encontrado" + id)
        );
    }
}
