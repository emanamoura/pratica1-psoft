package facade;

import service.ProdutoService;

public class ProdutoFacade {
    ProdutoService service;


    public ProdutoFacade() {
        this.service = new ProdutoService();
    }


    public void adicionaProduto(String nome, String fabricante, double preco) {
        this.service.adicionaProduto(nome, fabricante, preco);
    }
}
