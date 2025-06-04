public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto p1 = new Produto(1, "Camisa", 50.0, 10);
        Produto p2 = new Produto(2, "Calça", 100.0, 5);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);

        System.out.println("Tem Camisa no estoque? " + loja.temEstoque(1));
        System.out.println("Vendendo 3 Camisas...");
        loja.venderProduto(1, 3);
        System.out.println("Tem Camisa no estoque agora? " + loja.temEstoque(1));

        System.out.println("Produtos na loja:");
        System.out.println(p1);
        System.out.println(p2);
    }
}