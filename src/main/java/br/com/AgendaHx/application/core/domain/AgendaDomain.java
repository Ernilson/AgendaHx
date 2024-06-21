package br.com.AgendaHx.application.core.domain;

import br.com.AgendaHx.adapter.outPut.entities.PacienteEntity;

import java.time.LocalDateTime;

public class AgendaDomain {

    private Long id;
    private String descricao;
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;

    private PacienteDomain paciente;

    public AgendaDomain() {
    }

    public AgendaDomain(Long id, String descricao, LocalDateTime horario, LocalDateTime dataCriacao, PacienteDomain paciente) {
        this.id = id;
        this.descricao = descricao;
        this.horario = horario;
        this.dataCriacao = dataCriacao;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public PacienteDomain getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDomain paciente) {
        this.paciente = paciente;
    }
}
