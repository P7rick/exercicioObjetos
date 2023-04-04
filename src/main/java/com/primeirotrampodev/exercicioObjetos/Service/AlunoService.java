package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Aluno;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public String notaAluno() {

        Aluno aluno = new Aluno();
        aluno.setNome("Irineu");
        aluno.setNota1(7.0);
        aluno.setNota2(10.0);
        aluno.setNota3(9.0);

        Double media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;

        if(media >= 7.0 ){
            return "Parabéns aprovado!!" + '\n' + "Nota: " + media;
        }
        else{
            return "Reprovado, abaixo da média!!" + '\n' + " Nota: " + media;
        }
        }

    }

