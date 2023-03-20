package repository;

import java.util.HashMap;

public class ProdutoRepository {

    Map<Integer, Produto> repository;

    public ProdutoRepository() {
        this.repository = new HashMap<Integer, Produto>();
    }


    public void adicionaProduto(Produto produto) {
        this.repository.put(produto.getId(), produto);
    }
}
