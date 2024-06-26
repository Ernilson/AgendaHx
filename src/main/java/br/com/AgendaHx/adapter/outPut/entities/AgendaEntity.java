package br.com.AgendaHx.adapter.outPut.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_Agenda")
public class AgendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;

    @ManyToOne
    private PacienteEntity paciente;
}
