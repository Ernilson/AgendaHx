package br.com.AgendaHx.adapter.outPut.service.pacienteService;

import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.CreatePacienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePacienteAdapter implements CreatePacienteOutPutPort{

    @Autowired
    private PacienteRepository repository;

    @Autowired
    private PacienteConverter converter;

    @Override
    public void insert(PacienteDomain pacienteDomain) {
        var pacienteEntity = converter.toEntity(pacienteDomain);
        repository.save(pacienteEntity);
    }

}
