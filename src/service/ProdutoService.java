package service;

import entities.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
    private ProdutoRepository repository;

    public ProdutoService() {
        this.repository = new ProdutoRepository();
    }

    public void adicionaProduto(String nome, String fabricante, double preco) {
        if(preco < 0) {
            throw new IllegalArgumentException("It is not possible to create a product with a value less than 0");
        }
        Produto produto = new Produto(nome, fabricante, preco);
        this.repository.adicionaProduto(produto);
    }
}
