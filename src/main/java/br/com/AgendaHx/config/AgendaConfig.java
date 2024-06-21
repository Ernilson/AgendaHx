package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.agendaService.CreateAgendaAdapter;
import br.com.AgendaHx.application.core.useCase.agendaUsecase.CreateAgendaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendaConfig {

    @Bean
    public CreateAgendaUseCase createAgendaUseCase(CreateAgendaAdapter createAgendaAdapter){
        return new CreateAgendaUseCase(createAgendaAdapter);
    }
}
