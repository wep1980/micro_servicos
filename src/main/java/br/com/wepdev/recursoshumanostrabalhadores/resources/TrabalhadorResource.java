package br.com.wepdev.recursoshumanostrabalhadores.resources;


import br.com.wepdev.recursoshumanostrabalhadores.entities.Trabalhador;
import br.com.wepdev.recursoshumanostrabalhadores.repository.TrabalhadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {


    @Autowired
    private TrabalhadorRepository trabalhadorRepository;


    @GetMapping
    public ResponseEntity<List<Trabalhador>> findAll(){

        List<Trabalhador> list = trabalhadorRepository.findAll();
        return ResponseEntity.ok(list);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id){

        Trabalhador obj = trabalhadorRepository.findById(id).get(); // Pegando o Optional com get()

        return ResponseEntity.ok(obj);
    }
}
