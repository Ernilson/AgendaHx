package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.CreatePacienteAdapter;
import br.com.AgendaHx.application.core.useCase.CreatePacienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PacienteConfig {

    @Bean
    public CreatePacienteUseCase createPacienteUseCase(CreatePacienteAdapter createPacienteAdapter){
        return new CreatePacienteUseCase(createPacienteAdapter);
    }
}
