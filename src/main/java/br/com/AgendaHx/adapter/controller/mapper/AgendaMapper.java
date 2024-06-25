package br.com.AgendaHx.adapter.controller.mapper;

import br.com.AgendaHx.adapter.controller.request.AgendaRequest;
import br.com.AgendaHx.adapter.controller.response.AgendaResponse;
import br.com.AgendaHx.application.core.domain.AgendaDomain;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgendaMapper {

    private final ModelMapper mapper;

    public AgendaMapper(ModelMapper mapper){
       this.mapper = mapper;
    }

    public AgendaDomain toAgendaDomain(AgendaRequest request){
        return mapper.map(request, AgendaDomain.class);
    }

    public AgendaResponse toAgendaResponse(AgendaDomain agenda){
        return mapper.map(agenda, AgendaResponse.class);
    }

    public List<AgendaResponse> toAgendaResponseList(List<AgendaDomain> agendaDomainList){
        return agendaDomainList.stream()
                .map(this::toAgendaResponse)
                .collect(Collectors.toList());
    }
}
