package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Cliente;
import com.primeirotrampodev.exercicioObjetos.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @GetMapping("/dados")
    public Cliente getCliente(){

        return clienteService.dadosCliente();
    }

    @GetMapping("/idade")
    public String idadeCliente(){

        return clienteService.idadeCliente();
    }
}
