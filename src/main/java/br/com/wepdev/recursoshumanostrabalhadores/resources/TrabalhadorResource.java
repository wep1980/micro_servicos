package br.com.wepdev.recursoshumanostrabalhadores.resources;


import br.com.wepdev.recursoshumanostrabalhadores.entities.Trabalhador;
import br.com.wepdev.recursoshumanostrabalhadores.repository.TrabalhadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {


    // Objeto que imprime informações sobre o Logger
    private static Logger logger = LoggerFactory.getLogger(TrabalhadorResource.class);

    /**
     * Objeto(Instancia) que contem varias informações do contexto da aplicação
     */
    @Autowired
    private Environment env;

    @Autowired
    private TrabalhadorRepository trabalhadorRepository;



    @GetMapping
    public ResponseEntity<List<Trabalhador>> findAll(){

        List<Trabalhador> list = trabalhadorRepository.findAll();
        return ResponseEntity.ok(list);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Trabalhador> findById(@PathVariable Long id){

//        int x = 1;
//        if(x ==1){
//            throw new RuntimeException("teste"); // Simulando uma exception.  Feito para teste do Hystrix
//        }

//        try {
//            Thread.sleep(10000L); // Vai demorar 10 segundos antes de responder a requisição. Feito para teste do Hystrix
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Imprime no logger o numero da porta que esta rodando
        logger.info("PORT = " + env.getProperty("local.server.port"));

        Trabalhador obj = trabalhadorRepository.findById(id).get(); // Pegando o Optional com get()

        return ResponseEntity.ok(obj);
    }
}
