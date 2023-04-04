package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Produto;
import com.primeirotrampodev.exercicioObjetos.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;
@GetMapping("/estoque-produto")
    public String estoqueProduto(){

        return produtoService.produtos();
    }

}
