package br.com.AgendaHx.adapter.outPut.service.agendaService;

import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.FindAllAgendaOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindAllAgenda implements FindAllAgendaOutputPort {
    @Autowired
    private AgendaRepository repository;
    @Autowired
    private AgendaConverter converter;

    @Override
    public List<AgendaDomain> findAll() {
        var agendaEntities = repository.findAll();
        return agendaEntities.stream()
                .map(entity -> converter.toDomain(entity))
                .collect(Collectors.toList());
    }
}
