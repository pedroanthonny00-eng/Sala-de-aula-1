public class Produto1 {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
        System.out.println(quantidade + " unidade(s) adicionada(s) de " + nome);
    }

    void retirarEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
            System.out.println(quantidade + " unidade(s) retirada(s) de " + nome);
        } else {
            System.out.println("Estoque insuficiente de " + nome
                    + ". Disponível: " + this.quantidade);
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidade);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Produto1 produto1 = new Produto1();
        produto1.nome = "Caderno";
        produto1.preco = 15.90;
        produto1.quantidade = 20;

        Produto1 produto2 = new Produto1();
        produto2.nome = "Caneta";
        produto2.preco = 3.50;
        produto2.quantidade = 100;

        produto1.adicionarEstoque(10);
        produto1.retirarEstoque(5);
        produto1.retirarEstoque(100); // estoque insuficiente

        produto2.retirarEstoque(40);
        produto2.adicionarEstoque(15);

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}