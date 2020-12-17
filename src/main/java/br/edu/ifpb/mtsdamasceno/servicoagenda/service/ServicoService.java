package br.edu.ifpb.mtsdamasceno.servicoagenda.service;

import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Servico;
import br.edu.ifpb.mtsdamasceno.servicoagenda.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class  ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public List<Servico> getServicos() {
        return this.servicoRepository.findAll();
    }

    public Servico getServicoPorId(Long idServico) {
        return this.servicoRepository.findById(idServico).orElse(null);
    }

//    @Transactional
//    public Usuario inserirOuAtualizar(Usuario usuario) {
//        Usuario usuarioInserido = this.usuarioRepository.save(usuario);
//        if (usuario.getIdade() < 18) {
//            throw new RuntimeException("Menor de idade não permitido");
//        }
//        return usuarioInserido;
//    }

    public Servico inserirServico(Servico servico){
        this.servicoRepository.save(servico);
        return servico;
    }

    public void apagar(Long id) {
        this.servicoRepository.deleteById(id);
    }

}




