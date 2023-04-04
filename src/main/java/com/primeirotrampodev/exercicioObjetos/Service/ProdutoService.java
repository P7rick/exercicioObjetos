package com.primeirotrampodev.exercicioObjetos.Service;

import com.primeirotrampodev.exercicioObjetos.Entity.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    public String produtos() {

        Produto produto = new Produto();

        produto.setNome("Açai");
        produto.setPreco(15.00);
        produto.setQuantidade(10);

        Double valorEstoque = (produto.getPreco() * produto.getQuantidade());

        Integer adicionarEstoque = 150 + produto.getQuantidade();

        Double valorFinalDoEstoque = produto.getPreco() * adicionarEstoque;

        return "Produto: " + produto.getNome() + '\n' + "Preço: " +  produto.getPreco() + "R$" + '\n'+"Quantidade em Estoque: "+ produto.getQuantidade()+'\n'+'\n'
               + '\n' + '\n' + "Atualização de Estoque: " + adicionarEstoque + '\n' + "Valor total do estoque: "+ valorFinalDoEstoque;
    }
}
