package br.com.AgendaHx.application.core.useCase.pacienteUseCase;

import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.CreatePacienteInputPort;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.CreatePacienteOutPutPort;

public class CreatePacienteUseCase implements CreatePacienteInputPort {

    private final CreatePacienteOutPutPort paciente;

    public CreatePacienteUseCase(CreatePacienteOutPutPort paciente){
        this.paciente = paciente;
    }

    @Override
    public void create(PacienteDomain pacienteDomain) {
        paciente.insert(pacienteDomain);

    }
}
