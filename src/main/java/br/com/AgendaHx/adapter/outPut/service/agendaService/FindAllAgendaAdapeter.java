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
public class FindAllAgendaAdapeter implements FindAllAgendaOutputPort {

    @Autowired
    private AgendaRepository repository;

    @Autowired
    private AgendaConverter converter;


    @Override
    public List<AgendaDomain> findAll() {
        var entities = repository.findAll();
        return entities.stream().map(converter::toDomain)
                .collect(Collectors.toList());
    }
}
