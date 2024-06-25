package br.com.AgendaHx.config;

import br.com.AgendaHx.adapter.outPut.service.pacienteService.CreatePacienteAdapter;
import br.com.AgendaHx.adapter.outPut.service.pacienteService.FindAllPacienteAdapter;
import br.com.AgendaHx.adapter.outPut.service.pacienteService.FindPacienteByIdAdapter;
import br.com.AgendaHx.application.core.useCase.agendaUsecase.FindAllAgendaUseCase;
import br.com.AgendaHx.application.core.useCase.pacienteUseCase.CreatePacienteUseCase;
import br.com.AgendaHx.application.core.useCase.pacienteUseCase.FindAllPacienteUseCase;
import br.com.AgendaHx.application.core.useCase.pacienteUseCase.FindPacienteByIdUseCase;
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

    @Bean
    public FindPacienteByIdUseCase findPacienteByIdUseCase(FindPacienteByIdAdapter findPacienteByIdAdapter){
        return new FindPacienteByIdUseCase(findPacienteByIdAdapter);
    }

    @Bean
    public FindAllPacienteUseCase findAllPacienteUseCase (FindAllPacienteAdapter findAllPacienteAdapter){
        return new FindAllPacienteUseCase(findAllPacienteAdapter);
    }
}
