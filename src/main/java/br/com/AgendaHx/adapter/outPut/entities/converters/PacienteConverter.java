package br.com.AgendaHx.adapter.outPut.entities.converters;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.springframework.stereotype.Component;

@Component
public class PacienteConverter {

    public PacienteEntity toEntity(PacienteDomain domain) {
        PacienteEntity entity = new PacienteEntity();
        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setSobreNome(domain.getSobreNome());
        entity.setCpf(domain.getCpf());
        entity.setEmail(domain.getEmail());
        return entity;
    }

    //Converte de Entity para Domain
    public PacienteDomain toDomain(PacienteEntity entity) {
        PacienteDomain domain = new PacienteDomain();
        domain.setId(entity.getId());
        domain.setNome(entity.getNome());
        domain.setSobreNome(entity.getSobreNome());
        domain.setCpf(entity.getCpf());
        domain.setEmail(entity.getEmail());
        return domain;
    }
}
