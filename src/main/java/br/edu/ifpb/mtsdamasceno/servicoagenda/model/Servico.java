package br.edu.ifpb.mtsdamasceno.servicoagenda.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tipo;

    @OneToMany
    @JoinColumn(name = "prestador_id")
    private List<Prestador> prestador = new ArrayList<Prestador>();

    public Servico(){}

    public Servico(String tipo, Prestador prestador){
        this.tipo = tipo;
        this.prestador.add(prestador);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Prestador> getPrestador() {
        return prestador;
    }

    public void setPrestador(List<Prestador> prestador) {
        this.prestador = prestador;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", prestador=" + prestador +
                '}';
    }
}
