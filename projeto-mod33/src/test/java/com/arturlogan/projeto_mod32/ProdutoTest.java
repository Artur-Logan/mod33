package com.arturlogan.projeto_mod32;

import com.arturlogan.projeto_mod32.services.interfaces.ICarroService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTest {

    @Autowired
    private ICarroService produtoService;

//    @Test
//    public void cadastrar() {
//        Produto produto = new Produto();
//        // Configure o produto aqui
//        produto.setNome("Nome 1");
//        produto.setCodigo("Codigo 1");
//        produtoService.cadastrar(produto);
//
//        Assertions.assertNotNull(produto);
//    }
}
