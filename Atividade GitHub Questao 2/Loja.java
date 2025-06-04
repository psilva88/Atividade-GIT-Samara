import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // 1 Buscar um produto pelo código
    public Produto buscarPorCodigo(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    // 2 Verificar se há produto em estoque
    public boolean temEstoque(int codigo) {
        Produto p = buscarPorCodigo(codigo);
        return p != null && p.getQuantidadeEstoque() > 0;
    }

    // 3 Atualizar estoque ao realizar uma venda
    public boolean venderProduto(int codigo, int quantidade) {
        Produto p = buscarPorCodigo(codigo);
        if (p != null && p.getQuantidadeEstoque() >= quantidade) {
            p.setQuantidadeEstoque(p.getQuantidadeEstoque() - quantidade);
            return true;
        }
        return false;
    }

    // 4 Exibir produtos com estoque abaixo de 5 unidades
    public void exibirProdutosBaixoEstoque() {
        System.out.println("Produtos com estoque abaixo de 5 unidades:");
        for (Produto p : produtos) {
            if (p.getQuantidadeEstoque() < 5) {
                System.out.println(p);
            }
        }
    }
}