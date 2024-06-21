package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.pacienteService.CreatePacienteAdapter;
import br.com.AgendaHx.application.core.useCase.pacienteUseCase.CreatePacienteUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PacienteConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public CreatePacienteUseCase createPacienteUseCase(CreatePacienteAdapter createPacienteAdapter){
        return new CreatePacienteUseCase(createPacienteAdapter);
    }
}
