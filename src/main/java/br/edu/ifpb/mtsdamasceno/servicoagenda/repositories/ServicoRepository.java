package br.edu.ifpb.mtsdamasceno.servicoagenda.repositories;

import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
