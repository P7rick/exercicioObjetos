package com.primeirotrampodev.exercicioObjetos.Controller;


import com.primeirotrampodev.exercicioObjetos.Entity.Carro;
import com.primeirotrampodev.exercicioObjetos.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;
    @GetMapping("/atributos")
    public Carro getCarro(){

        return carroService.atributosCarro();


    }
}
