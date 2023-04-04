package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Livro;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    public Livro livro() {

        Livro livro = new Livro();

        livro.setAutor("Pablo Henrique");
        livro.setTitulo("Programação é vida!");
        livro.setNumeroPaginas(630);

        return livro;
    }
    public String quantPaginas(){

       Integer numeroPaginas = 630;

        if(numeroPaginas >= 500){
            return "Livro grosso, mais de 500 paginas!";
        }
            else{
                return "Menos de 500 paginas";
            }
        }
    }


