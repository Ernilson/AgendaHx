//package br.com.AgendaHx;
//
//import br.com.AgendaHx.adapter.outPut.entities.converters.AgendaConverter;
//import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
//import br.com.AgendaHx.adapter.outPut.service.agendaService.CreateAgendaAdapter;
//import br.com.AgendaHx.adapter.outPut.service.agendaService.FindAgendaByIdAdapter;
//import br.com.AgendaHx.adapter.outPut.service.pacienteService.CreatePacienteAdapter;
//import br.com.AgendaHx.adapter.outPut.service.pacienteService.FindPacienteByIdAdapter;
//import br.com.AgendaHx.application.core.domain.AgendaDomain;
//import br.com.AgendaHx.application.core.domain.PacienteDomain;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDateTime;
//import java.util.Optional;
//
//@SpringBootTest
//class AgendaHxApplicationServerTests {
//
//	@Autowired
//	private CreatePacienteAdapter servico;
//
//	@Autowired
//	private FindPacienteByIdAdapter findPacienteByIdAdapter;
//
//	@Autowired
//	private FindAgendaByIdAdapter findAgendaByIdAdapter;
//
//	@Autowired
//	private CreateAgendaAdapter agendaSevico;
//
//	@Autowired
//	private PacienteConverter converter;
//
//	@Autowired
//	private AgendaConverter agendaConverter;
//
//
//	@Test
//	void contextLoads() {
//		PacienteDomain domain = new PacienteDomain();
//		domain.setNome("Teste");
//		domain.setSobreNome("souza");
//		domain.setCpf("69779848134");
//		domain.setEmail("teste@teste.com");
//
//		servico.insert(domain);
//	}
//
//	@Test
//	void findPaciente() {
//		Optional<PacienteDomain> optionalPaciente = findPacienteByIdAdapter.findById(1L);
//
//		if (optionalPaciente.isPresent()) {
//			PacienteDomain paciente = optionalPaciente.get();
//			System.out.println("Chamando findById com ID: " + paciente.getId() + " - Nome: " + paciente.getNome());
//		} else {
//			System.out.println("Paciente não encontrado com ID: 1");
//		}
//	}
//
//	@Test
//	void angendaLoads(){
//		AgendaDomain agendaDomain = new AgendaDomain();
//		PacienteDomain domain = new PacienteDomain();
//		domain.setId(1);
//		agendaDomain.setDescricao("mais teste de integracao");
//		agendaDomain.setDataCriacao(LocalDateTime.now());
//		agendaDomain.setHorario(LocalDateTime.now());
//		agendaDomain.setPaciente(domain);
//
//		agendaSevico.createAgenda(agendaDomain);
//	}
//
//	@Test
//	void findAgenda() {
//		Optional<AgendaDomain> optionalAgenda = findAgendaByIdAdapter.findById(752L);
//
//		if (optionalAgenda.isPresent()) {
//			AgendaDomain agenda = optionalAgenda.get();
//			System.out.println("Chamando findById com ID: " + agenda.getId() + " - Nome: " + agenda.getDescricao());
//		} else {
//			System.out.println("Paciente não encontrado com ID: 1");
//		}
//	}
//
//}
