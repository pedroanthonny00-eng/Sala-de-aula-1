public class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
        System.out.println("-----------------------");
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
        System.out.println("Desconto de " + percentual + "% aplicado em " + nome);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse", 80.00, 50);
        Produto p3 = new Produto("Teclado", 150.00, 30);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        p1.aplicarDesconto(10);
        p1.exibirProduto();
    }
}