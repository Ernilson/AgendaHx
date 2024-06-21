package br.com.AgendaHx.application.core.exception;

public class PacienteNotFoundException extends RuntimeException{

    public  PacienteNotFoundException(){
        super("Paciente not found");
    }

    public PacienteNotFoundException(String message){
        super(message);

    }
}
