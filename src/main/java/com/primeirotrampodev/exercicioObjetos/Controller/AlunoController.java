package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Aluno;
import com.primeirotrampodev.exercicioObjetos.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/notas")
    public String notasAluno() {

        return alunoService.notaAluno();
    }
}


