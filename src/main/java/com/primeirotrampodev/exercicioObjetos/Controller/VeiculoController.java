package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Veiculo;
import com.primeirotrampodev.exercicioObjetos.Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/atributos")
    public String veiculosAtributos() {

        return veiculoService.atributosCarro();
    }
@GetMapping("/veiculo-freiar")
    public String veiculoFreiar(){

        return veiculoService.frenagemVeiculo();
    }
}
