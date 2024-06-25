//package br.com.AgendaHx.adapter.outPut.service.pacienteService;
//
//import br.com.AgendaHx.adapter.outPut.entities.converters.PacienteConverter;
//import br.com.AgendaHx.adapter.outPut.repository.PacienteRepository;
//import br.com.AgendaHx.application.core.domain.AgendaDomain;
//import br.com.AgendaHx.application.ports.inPut.pacienteInputPort.FindAllPacienteInputPort;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class FindAllPacienteAdapeter implements FindAllPacienteInputPort {
//
//    @Autowired
//    private PacienteRepository repository;
//
//    @Autowired
//    private PacienteConverter converter;
//
//    @Override
//    public List<AgendaDomain> findAll() {
//        var entities = repository.findAll();
//        return entities.stream().map(converter::toDomain).collect(Collectors.toList());
//    }
//}
