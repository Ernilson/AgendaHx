package br.com.AgendaHx.adapter.outPut.service.agendaService;

import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.FindAgendaByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindAgendaByIdAdapter implements FindAgendaByIdOutputPort {

    @Autowired
    private AgendaRepository repository;

    @Autowired
    private AgendaConverter converter;

    @Override
    public Optional<AgendaDomain> findById(Long id) {
        var agendaEntity = repository.findById(id);
        return agendaEntity.map(entity -> converter.toDomain(entity));
    }
}
