package br.com.AgendaHx.adapter.outPut.service.pacienteService;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.FindAllPacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindAllPacienteAdapter implements FindAllPacienteOutputPort {

    @Autowired
    private PacienteRepository repository;

    @Autowired
    private PacienteConverter converter;

    @Override
    public List<PacienteDomain> findAll() {
        List<PacienteEntity> pacienteEntities = repository.findAll();
        return pacienteEntities.stream()
                .map(entity -> converter.toDomain(entity))
                .collect(Collectors.toList());
    }
}
