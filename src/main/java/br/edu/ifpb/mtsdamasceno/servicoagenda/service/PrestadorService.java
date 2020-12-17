package br.edu.ifpb.mtsdamasceno.servicoagenda.service;


import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Prestador;
import br.edu.ifpb.mtsdamasceno.servicoagenda.repositories.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class  PrestadorService {

    @Autowired
    private PrestadorRepository prestadorRepository;

    public List<Prestador> getPrestadores() {
        return this.prestadorRepository.findAll();
    }

    public Prestador getPrestadorPorId(Long idPrestador) {
        return this.prestadorRepository.findById(idPrestador).orElse(null);
    }

//    @Transactional
//    public Usuario inserirOuAtualizar(Usuario usuario) {
//        Usuario usuarioInserido = this.usuarioRepository.save(usuario);
//        if (usuario.getIdade() < 18) {
//            throw new RuntimeException("Menor de idade não permitido");
//        }
//        return usuarioInserido;
//    }

    public Prestador inserirPrestador(Prestador prestador){
        this.prestadorRepository.save(prestador);
        return prestador;
    }

    public void apagar(Long id) {
        this.prestadorRepository.deleteById(id);
    }

}



