package br.com.AgendaHx.adapter.outPut.service.pacienteService;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
import br.com.AgendaHx.application.ports.outPut.pacienteOutputPort.DeletePacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePacienteAdapter implements DeletePacienteOutputPort {
    @Autowired
    private PacienteRepository repository;

    @Override
    public void deleteById(Long id) {
       repository.deleteById(id);
    }
}
