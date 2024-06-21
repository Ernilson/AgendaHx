package br.com.AgendaHx.adapter.outPut.entities.converters;

import br.com.AgendaHx.adapter.outPut.entities.AgendaEntity;
import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.springframework.stereotype.Component;

@Component
public class AgendaConverter {

    public AgendaEntity toEntity(AgendaDomain domain) {
        AgendaEntity entity = new AgendaEntity();
        entity.setId(domain.getId());
        entity.setDescricao(domain.getDescricao());
        entity.setDataCriacao(domain.getDataCriacao());
        entity.setHorario(domain.getHorario());
        PacienteEntity pacienteEntity = new PacienteEntity();
        pacienteEntity.setId(domain.getPaciente().getId());
        entity.setPaciente(pacienteEntity);
        return entity;
    }

    public AgendaDomain toDomain(AgendaEntity entity) {
        AgendaDomain domain = new AgendaDomain();
        domain.setId(entity.getId());
        domain.setDescricao(entity.getDescricao());
        domain.setHorario(entity.getHorario());
        PacienteDomain pacienteDomain = new PacienteDomain();
        pacienteDomain.setId(entity.getPaciente().getId());
        pacienteDomain.setNome(entity.getPaciente().getNome());
        domain.setPaciente(pacienteDomain);
        return domain;
    }
}
