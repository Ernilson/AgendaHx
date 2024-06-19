package br.com.AgendaHx.adapter.outPut.service;

import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.ports.outPut.CreateAgendaOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAgendaAdapter implements CreateAgendaOutPutPort {

    @Autowired
    private AgendaRepository repository;

    @Autowired
    private AgendaConverter converter;

    @Override
    public void createAgenda(AgendaDomain agendaDomain) {
        var agendaEntity = converter.toEntity(agendaDomain);
        repository.save(agendaEntity);
    }
}
