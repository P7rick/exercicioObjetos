package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Veiculo;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    public String atributosCarro(){

        Veiculo veiculo = new Veiculo();

        veiculo.setMarca("Fiat");
        veiculo.setModelo("Palio");
        veiculo.setAno(2008);
        veiculo.setVelocidade(120);

        Integer acelerar = veiculo.getVelocidade() + 30;

        Integer freiar = veiculo.getVelocidade() - 50;

        return "Marca:" + veiculo.getMarca() + '\n'+ "Modelo:" + veiculo.getModelo() + '\n' + "Ano: " + veiculo.getAno() +'\n' + "Velocidade: " +
                veiculo.getVelocidade()+"Km/h" + '\n'+'\n' + " Acelerando.... : " + acelerar + "Km/h" + '\n' + '\n' + "Freiando....: " + freiar + "Km/h" + '\n' + '\n';

    }

}
