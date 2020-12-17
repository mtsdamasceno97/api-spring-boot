package br.edu.ifpb.mtsdamasceno.servicoagenda.service;


import br.edu.ifpb.mtsdamasceno.servicoagenda.repositories.ClienteRepository;
import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class  ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes() {
        return this.clienteRepository.findAll();
    }

    public Cliente getClientesPorId(Long idCliente) {
        return this.clienteRepository.findById(idCliente).orElse(null);
    }

    public Cliente inserirCliente(Cliente cliente){
        this.clienteRepository.save(cliente);
        return cliente;
    }

    public void apagar(Long id) {
        this.clienteRepository.deleteById(id);
    }
}


