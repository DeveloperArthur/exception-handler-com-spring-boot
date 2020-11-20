package br.com.tratamentodeexception.arthur.dominio.exception.cliente;

public class CamposDeClienteObrigatoriosException extends RuntimeException {
    public CamposDeClienteObrigatoriosException() {
        super("Nome e Email são dados obrigatórios para criar um cliente.");
    }
}
