package br.com.AgendaHx.adapter.outPut.service.agendaService;

import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.DeleteAgendaOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAgendaByIdAdapter implements DeleteAgendaOutPutPort {

    @Autowired
    private AgendaRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
