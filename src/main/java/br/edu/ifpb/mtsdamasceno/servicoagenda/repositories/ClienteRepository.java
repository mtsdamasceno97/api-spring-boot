package br.edu.ifpb.mtsdamasceno.servicoagenda.repositories;

import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

