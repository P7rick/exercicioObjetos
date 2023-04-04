package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Service.RetanguloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retangulo")
public class RetanguloController {

    @Autowired
    private RetanguloService retanguloService;

    @GetMapping("/area-retangulo")
    public Double areaRetangulo(){

        return retanguloService.areaRetangulo();
    }
    @GetMapping("/perimetro-retangulo")
    public Double perimetroRetangulo(){

        return retanguloService.perimetroAtributos();
    }
}
