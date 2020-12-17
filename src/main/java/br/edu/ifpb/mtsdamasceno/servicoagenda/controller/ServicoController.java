package br.edu.ifpb.mtsdamasceno.servicoagenda.controller;


import br.edu.ifpb.mtsdamasceno.servicoagenda.model.Servico;
import br.edu.ifpb.mtsdamasceno.servicoagenda.service.ServicoService;
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
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/servicos")
    public List<Servico> getServicos() {
        return this.servicoService.getServicos();
    }

    @GetMapping("/servicos/{id}")
    public Servico getServicosPorId(@PathVariable("id") Long idServico) {
        return this.servicoService.getServicoPorId(idServico);
    }

    @PostMapping("/servicos")
    public Servico inserirServico(@RequestBody Servico servico){
        return this.servicoService.inserirServico(servico);
    }

    @PutMapping("/servicos/{id}")
    public Servico atualizarServico(@RequestBody Servico servico){
        return this.servicoService.inserirServico(servico);
    }

    @DeleteMapping("/servicos/{id}")
    public void apagarServico(@PathVariable("id") Long id) {
        this.servicoService.apagar(id);
    }
}


