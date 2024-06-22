package br.com.AgendaHx.pacienteServiceTest;

import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
import br.com.AgendaHx.adapter.outPut.service.pacienteService.CreatePacienteAdapter;
import br.com.AgendaHx.adapter.outPut.service.pacienteService.FindPacienteByIdAdapter;
import br.com.AgendaHx.application.core.domain.PacienteDomain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class PacienteTests {
    @Autowired
    private CreatePacienteAdapter servico;

    @Autowired
    private FindPacienteByIdAdapter findPacienteByIdAdapter;

    @Autowired
    private PacienteConverter converter;

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
    void findPaciente() {
        Optional<PacienteDomain> optionalPaciente = findPacienteByIdAdapter.findById(1L);

        if (optionalPaciente.isPresent()) {
            PacienteDomain paciente = optionalPaciente.get();
            System.out.println("Chamando findById com ID: " + paciente.getId() + " - Nome: " + paciente.getNome());
        } else {
            System.out.println("Paciente não encontrado com ID: 1");
        }
    }

}
