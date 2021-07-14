package jonatas.santos.project.learn.controllers;

import jonatas.santos.project.learn.entities.Andress;
import jonatas.santos.project.learn.services.FindCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ceps")
public class CepController {

    @Autowired
    FindCep findCep;


    @GetMapping(value = "/{cep}")
    public Andress getAndress(@PathVariable String cep){
        System.out.println("Cheguei aqui: " + cep);
        return  findCep.getAndress(cep);


    }
}
