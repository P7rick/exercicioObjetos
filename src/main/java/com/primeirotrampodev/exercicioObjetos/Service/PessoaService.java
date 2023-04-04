package com.primeirotrampodev.exercicioObjetos.Service;
import com.primeirotrampodev.exercicioObjetos.Entity.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class PessoaService{

    public Pessoa atributosDaPessoa() {

       Pessoa pessoa = new Pessoa();

       pessoa.setNome("Pablo Henrique Muniz");
       pessoa.setIdade(26);
       pessoa.setAltura(1.71);

       return pessoa;
    }
}

