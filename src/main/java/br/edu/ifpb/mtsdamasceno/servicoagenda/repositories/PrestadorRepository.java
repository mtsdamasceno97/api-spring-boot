package br.edu.ifpb.mtsdamasceno.servicoagenda.repositories;

import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository extends JpaRepository<Prestador, Long> {
}
