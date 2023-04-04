package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Conta;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    public String sacarValor() {

        Conta conta = new Conta();

        conta.setTitular("Adamastor");
        conta.setSaldo(20000);

        Integer saque = 500;
        Integer deposito = 1500;

        Integer saqueFinal = conta.getSaldo() - saque;
        Integer depositoFinal = conta.getSaldo() + deposito;

        return "Titular : " + conta.getTitular() + '\n' + "Saldo inicial: " + conta.getSaldo() + '\n' + "Saque: " +  saque + '\n' + "Saldo Final: " + saqueFinal +'\n' + '\n' + "Saldo inicial: " + conta.getSaldo() +'\n' +  "Deposito: " + deposito + '\n' + "Saldo Final: "+ depositoFinal;
        }
    }
