package com.primeirotrampodev.exercicioObjetos.Service;

import org.springframework.stereotype.Service;

@Service
public class RetanguloService {
    public Double areaRetangulo() {

        Double areaRetangulo;
        Double base = 4.0;
        Double altura = 10.0;


        areaRetangulo = base * altura;

        return areaRetangulo;
    }

    public Double perimetroAtributos() {

        Double areaRetangulo;
        Double base = 4.0;
        Double altura = 10.0;

        areaRetangulo = base * altura * 2;

        return areaRetangulo;
    }
}
