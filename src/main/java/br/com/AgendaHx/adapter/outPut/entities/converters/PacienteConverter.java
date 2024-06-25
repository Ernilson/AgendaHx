package br.com.AgendaHx.adapter.outPut.entities.converters;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class PacienteConverter {


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

    //Converte de Domain para Entity
    public PacienteEntity toEntity(PacienteDomain domain) {
        PacienteEntity entity = new PacienteEntity();
        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setSobreNome(domain.getSobreNome());
        entity.setCpf(domain.getCpf());
        entity.setEmail(domain.getEmail());
        return entity;
    }

    public List<PacienteEntity> toPacienteDomainList(List<PacienteDomain> pacientes) {
        List<PacienteEntity> entities = new ArrayList<>();
        for (PacienteDomain paciente : pacientes) {
            entities.add(toEntity(paciente));
        }
        return entities;
    }
}
