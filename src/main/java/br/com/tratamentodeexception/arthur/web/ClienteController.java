package br.com.tratamentodeexception.arthur.web;

import br.com.tratamentodeexception.arthur.dominio.cliente.Cliente;
import br.com.tratamentodeexception.arthur.dominio.cliente.Sexo;
import br.com.tratamentodeexception.arthur.infra.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteDao clienteDao;

    @PostMapping
    public ResponseEntity<Cliente> salva(String nome, String email, Integer idade, Sexo sexo) {
        Cliente cliente = new Cliente(nome, email, idade, sexo);
        clienteDao.salva(cliente);
        return ResponseEntity.ok(cliente);
    }
}
