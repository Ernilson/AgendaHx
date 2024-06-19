package br.com.AgendaHx.adapter.outPut.entities.converters;

import br.com.AgendaHx.adapter.outPut.entities.AgendaEntity;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import org.springframework.stereotype.Component;

@Component
public class AgendaConverter {

    public AgendaEntity toEntity(AgendaDomain domain){
        AgendaEntity entity = new AgendaEntity();
        entity.setId(domain.getId());
        entity.setDescricao(domain.getDescricao());
        entity.setDataCriacao(domain.getDataCriacao());
        entity.setHorario(domain.getHorario());
        //entity.setPaciente(domain.getPaciente());
        return entity;
    }

    //Converte de Entity para Domain
    public AgendaDomain toDomain(AgendaEntity entity) {
        AgendaDomain domain = new AgendaDomain();
        domain.setId(entity.getId());
        domain.setDescricao(entity.getDescricao());
        domain.setHorario(entity.getHorario());
       // domain.setPaciente(entity.getPaciente());

        return domain;
    }
}
