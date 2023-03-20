import facade.ProdutoFacade;

public class Client {
    public static void main(String[] args) {
        ProdutoFacade produtoFacade = new ProdutoFacade();
        produtoFacade.adicionaProduto("Leite Parmalate", "Agronegócio punk", 25.1);
        produtoFacade.adicionaProduto("Ovos de peru", "Agronegócio punk", 78);
    }
}
