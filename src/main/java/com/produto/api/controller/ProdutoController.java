package com.produto.api.controller;

import com.produto.api.model.Produto;
import com.produto.api.model.Produto2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class ProdutoController {
    @GetMapping("/Produto")
    public String Produto() {
        return "Api funcionando";
    }


    @PostMapping ("/Produto")
    public Produto cadastrar(@RequestBody Produto produto) {
        return produto;
    }

    @GetMapping("/Produto2")
    public String Produto2() {
        return "Api funcionando 2";
    }

    @PostMapping("/Produto2")
    public Produto2 cadastrar(@RequestBody Produto2 produto2){
        return produto2;
    }
}