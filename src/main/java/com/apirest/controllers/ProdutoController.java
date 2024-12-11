package com.apirest.controllers;

import com.apirest.models.Produto;
import com.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna um produto unico")
    public Produto unicoProduto(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation(value = "Salva um produto")
    public Produto salvaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um produto")
    public void deleteProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Atualiza um produto")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
