package br.com.AgendaHx;

import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.service.CreateAgendaAdapter;
import br.com.AgendaHx.adapter.outPut.service.CreatePacienteAdapter;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class AgendaHxApplicationServerTests {

	@Autowired
	private CreatePacienteAdapter servico;

	@Autowired
	private CreateAgendaAdapter agendaSevico;

	@Autowired
	private PacienteConverter converter;

	@Autowired
	private AgendaConverter agendaConverter;


	@Test
	void contextLoads() {
		PacienteDomain domain = new PacienteDomain();
		domain.setNome("Teste");
		domain.setSobreNome("souza");
		domain.setCpf("69779848134");
		domain.setEmail("teste@teste.com");

		servico.insert(domain);
	}

	@Test
	void angendaLoads(){
		AgendaDomain agendaDomain = new AgendaDomain();
		PacienteDomain domain = new PacienteDomain();
		domain.setId(1);
		agendaDomain.setDescricao("mais teste");
		agendaDomain.setDataCriacao(LocalDateTime.now());
		agendaDomain.setHorario(LocalDateTime.now());
		agendaDomain.setPaciente(domain);

		agendaSevico.createAgenda(agendaDomain);
	}

}
