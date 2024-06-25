package br.com.AgendaHx.adapter.outPut.service.pacienteService;

import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.FindPacienteByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindPacienteByIdAdapter implements FindPacienteByIdOutputPort {

    @Autowired
    private PacienteRepository repository;

    @Autowired
    private PacienteConverter converter;

    @Override
    public Optional<PacienteDomain> findById(Long id) {
        var pacienteEntity = repository.findById(id);
        return pacienteEntity.map(entity -> converter.toDomain(entity));
    }

}
