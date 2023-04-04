package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Circulo;
import com.primeirotrampodev.exercicioObjetos.Service.CirculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

@RestController
@RequestMapping("/circulo")
public class CirculoController {

    @Autowired
    private CirculoService circuloService;
    @GetMapping("/area")
    public String calculoArea(Circulo circulo){
        return circuloService.raioCirculo(circulo);
    }
}
