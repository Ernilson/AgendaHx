package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.agendaService.CreateAgendaAdapter;
import br.com.AgendaHx.adapter.outPut.service.agendaService.FindAgendaByIdAdapter;
import br.com.AgendaHx.adapter.outPut.service.agendaService.FindAllAgendaAdapeter;
import br.com.AgendaHx.application.core.useCase.agendaUsecase.CreateAgendaUseCase;
import br.com.AgendaHx.application.core.useCase.agendaUsecase.FindAgendaByIdUseCase;
import br.com.AgendaHx.application.core.useCase.agendaUsecase.FindAllAgendaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendaConfig {

    @Bean
    public CreateAgendaUseCase createAgendaUseCase(CreateAgendaAdapter createAgendaAdapter){
        return new CreateAgendaUseCase(createAgendaAdapter);
    }

    @Bean
    public FindAllAgendaUseCase findAllAgendaUseCase(FindAllAgendaAdapeter findAllAgendaAdapeter){
        return new FindAllAgendaUseCase(findAllAgendaAdapeter);
    }

    @Bean
    public FindAgendaByIdUseCase findAgendaById(FindAgendaByIdAdapter findAgendaByIdAdapter){
        return new FindAgendaByIdUseCase(findAgendaByIdAdapter);
    }
}
