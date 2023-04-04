package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Circulo;
import org.springframework.stereotype.Service;

@Service
public class CirculoService {

    public String raioCirculo(Circulo circulo){

        Circulo circulo1 = new Circulo();
        circulo.setRaio(12.0);


        Double area = Math.PI * (circulo.getRaio() * circulo.getRaio());

        Double perimetro = (Math.PI * 2) * circulo.getRaio();

        return "Area do Circulo: " + area + '\n' + "Perimetro do Circulo: " + perimetro;

    }
}
