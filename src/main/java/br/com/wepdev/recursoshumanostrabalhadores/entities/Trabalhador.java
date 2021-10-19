package br.com.wepdev.recursoshumanostrabalhadores.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_trabalhador")
public class Trabalhador implements Serializable {


    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double ganhoPorDia;


    public Trabalhador() {
    }


    public Trabalhador(Long id, String nome, Double ganhoPorDia) {
        this.id = id;
        this.nome = nome;
        this.ganhoPorDia = ganhoPorDia;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGanhoPorDia() {
        return ganhoPorDia;
    }

    public void setGanhoPorDia(Double ganhoPorDia) {
        this.ganhoPorDia = ganhoPorDia;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trabalhador that = (Trabalhador) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(ganhoPorDia, that.ganhoPorDia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ganhoPorDia);
    }
}
