package br.com.AgendaHx.adapter.outPut.repository;

import br.com.AgendaHx.adapter.outPut.entities.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

}
