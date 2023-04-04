package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;
    @GetMapping("/saque-deposito")
    public String sacarValor(){

        return contaService.sacarValor();
    }
}
