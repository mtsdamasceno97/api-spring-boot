package br.edu.ifpb.mtsdamasceno.servicoagenda.controller;


import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Cliente;
import br.edu.ifpb.mtsdamasceno.servicoagenda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> getUsuarios() {
        return this.clienteService.getClientes();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getClientesPorId(@PathVariable("id") Long idCliente) {
        return this.clienteService.getClientesPorId(idCliente);
    }

    @PostMapping("/clientes")
    public Cliente inserirCliente(@RequestBody Cliente cliente){
        return this.clienteService.inserirCliente(cliente);
    }

    @PutMapping("/clientes/{id}")
    public Cliente atualizarUsuario(@RequestBody Cliente cliente){
        return this.clienteService.inserirCliente(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public void apagarCliente(@PathVariable("id") Long id) {
        this.clienteService.apagar(id);
    }
}

