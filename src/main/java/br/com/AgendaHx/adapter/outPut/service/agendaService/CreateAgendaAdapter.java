package br.com.AgendaHx.adapter.outPut.service.agendaService;

import br.com.AgendaHx.adapter.outPut.entities.AgendaEntity;
import br.com.AgendaHx.adapter.outPut.repository.AgendaRepository;
import br.com.AgendaHx.adapter.outPut.service.pacienteService.FindPacienteByIdAdapter;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import br.com.AgendaHx.application.ports.outPut.agendaOutputPort.CreateAgendaOutPutPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CreateAgendaAdapter implements CreateAgendaOutPutPort {

    @Autowired
    private AgendaRepository repository;

    @Autowired
    private FindAgendaByIdAdapter findAgendaByIdAdapter;

    @Autowired
    private FindPacienteByIdAdapter findPacienteByIdAdapter;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void createAgenda(AgendaDomain agendaDomain) {
        Optional<PacienteDomain> optionalPaciente = findPacienteByIdAdapter.findById(agendaDomain.getPaciente().getId());

        if (optionalPaciente.isPresent()) {
            throw new RuntimeException("Paciente não encontrado");
        }

       // Optional<AgendaDomain> optionalHorario = findAgendaByIdAdapter.findById(agendaDomain.getHorario());

       // if (optionalHorario.isPresent()) {
        //  throw new RuntimeException("Já existe agendamento para este horário");
      //  }

        agendaDomain.setDataCriacao(LocalDateTime.now());
       // agendaDomain.setPaciente(optionalPaciente.get());

        var agendaEntity = mapper.map(agendaDomain, AgendaEntity.class);
         repository.save(agendaEntity);

    }
}
