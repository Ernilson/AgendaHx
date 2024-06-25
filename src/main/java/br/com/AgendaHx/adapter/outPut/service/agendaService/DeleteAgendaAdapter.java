package br.com.AgendaHx.adapter.outPut.service.agendaService;

import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.DeleteAgendaOutPutPort;

public class DeleteAgendaAdapter implements DeleteAgendaOutPutPort {

    private AgendaRepository repository;

    private AgendaConverter converter;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}
