package com.primeirotrampodev.exercicioObjetos.Controller;

import com.primeirotrampodev.exercicioObjetos.Entity.Livro;
import com.primeirotrampodev.exercicioObjetos.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    private LivroService livroService;
    @GetMapping("/atributos-livro")
    public Livro atributosLivro(){

        return livroService.livro();
    }
    @GetMapping("/quantidade-paginas")
    public String paginasLivro(){

        return livroService.quantPaginas();
    }
}
