public class Aluno1 {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Aluno1 aluno1 = new Aluno1();
        aluno1.nome = "Ana Souza";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;

        Aluno1 aluno2 = new Aluno1();
        aluno2.nome = "Bruno Lima";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}