package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Carro;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    public Carro atributosCarro() {

        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setModelo("Fastback");
        carro.setAno(2023);

        return carro;
    }
}
