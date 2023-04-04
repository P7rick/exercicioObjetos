package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public Cliente dadosCliente(){

        Cliente cliente = new Cliente();

        cliente.setNome("Pablo Henrique M Neves");
        cliente.setEndereco("Av. Tereza Lourenço Rodigues 445");
        cliente.setIdade(26);
        cliente.setTelefone(973669913);

        return cliente;
    }

    public String idadeCliente(){

        Integer idadeCliente = 26;

        if(idadeCliente >=18 ){
            return "Cliente maior de idade!";
        }
        else{
            return "Cliente menor de idade";

        }
    }
}
