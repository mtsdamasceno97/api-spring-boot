package br.edu.ifpb.mtsdamasceno.servicoagenda.controller;


import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Prestador;
import br.edu.ifpb.mtsdamasceno.servicoagenda.service.PrestadorService;
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
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    @GetMapping("/prestador")
    public List<Prestador> getPretadores() {
        return this.prestadorService.getPrestadores();
    }

    @GetMapping("/prestadores/{id}")
    public Prestador getPrestadoresPorId(@PathVariable("id") Long idPrestador) {
        return this.prestadorService.getPrestadorPorId(idPrestador);
    }

    @PostMapping("/prestadores")
    public Prestador inserirPrestador(@RequestBody Prestador prestador){
        return this.prestadorService.inserirPrestador(prestador);
    }

    @PutMapping("/prestadores/{id}")
    public Prestador atualizarPrestador(@RequestBody Prestador prestador){
        return this.prestadorService.inserirPrestador(prestador);
    }

    @DeleteMapping("/prestadores/{id}")
    public void apagarPrestador(@PathVariable("id") Long id) {
        this.prestadorService.apagar(id);
    }
}

