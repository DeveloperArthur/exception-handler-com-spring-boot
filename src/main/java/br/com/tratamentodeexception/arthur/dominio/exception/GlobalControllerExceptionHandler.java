package br.com.tratamentodeexception.arthur.dominio.exception;

import br.com.tratamentodeexception.arthur.dominio.exception.cliente.CamposDeClienteObrigatoriosException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
    private ResponseEntity<Object> buildResponseEntity(ErroApiForm erroApi) {
        return new ResponseEntity<>(erroApi, erroApi.getStatus());
    }

    @ExceptionHandler(CamposDeClienteObrigatoriosException.class)
    protected ResponseEntity<Object> handleCamposDeClienteObrigatoriosException(CamposDeClienteObrigatoriosException ex) {
        ErroApiForm form = new ErroApiForm(HttpStatus.BAD_REQUEST, ex);
        return buildResponseEntity(form);
    }
}
