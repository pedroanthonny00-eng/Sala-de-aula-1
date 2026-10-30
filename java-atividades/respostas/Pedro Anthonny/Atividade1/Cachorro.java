public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Pastor Alemão";
        c1.idade = 5;

        Cachorro c2 = new Cachorro();
        c2.nome = "Bolt";
        c2.raca = "Labrador";
        c2.idade = 3;

        Cachorro c3 = new Cachorro();
        c3.nome = "Mel";
        c3.raca = "Poodle";
        c3.idade = 2;

        c1.latir();
        c1.brincar();
        c1.exibirDados();

        c2.latir();
        c2.brincar();
        c2.exibirDados();

        c3.latir();
        c3.brincar();
        c3.exibirDados();
    }
}