package br.com.AgendaHx.adapter.outPut.repository;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {

}
