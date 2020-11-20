package br.com.tratamentodeexception.arthur.infra;

import br.com.tratamentodeexception.arthur.dominio.cliente.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteDao {
    List<Cliente> clientes = new ArrayList<>();

    public void salva(Cliente cliente) {
        clientes.add(cliente);
    }
}
