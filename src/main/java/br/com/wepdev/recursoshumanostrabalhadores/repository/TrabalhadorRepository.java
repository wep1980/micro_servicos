package br.com.wepdev.recursoshumanostrabalhadores.repository;

import br.com.wepdev.recursoshumanostrabalhadores.entities.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {


}
