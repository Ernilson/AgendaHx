package br.com.AgendaHx.application.core.useCase.pacienteUseCase;

import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.DeletePacienteInputPort;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.DeletePacienteOutputPort;

public class DeletePacienteUseCase implements DeletePacienteInputPort {

    private final DeletePacienteOutputPort deletePacienteOutputPort;

    public DeletePacienteUseCase(DeletePacienteOutputPort deletePacienteOutputPort){
        this.deletePacienteOutputPort = deletePacienteOutputPort;
    }
    @Override
    public void deleteById(Long id) {
        deletePacienteOutputPort.deleteById(id);
    }
}
