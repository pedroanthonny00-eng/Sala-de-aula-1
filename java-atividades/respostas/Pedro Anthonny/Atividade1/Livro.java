public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("Abrindo o livro \"" + titulo + "\"...");
    }

    void fecharLivro() {
        System.out.println("Fechando o livro \"" + titulo + "\".");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroPaginas = 96;

        Livro livro3 = new Livro();
        livro3.titulo = "1984";
        livro3.autor = "George Orwell";
        livro3.numeroPaginas = 328;

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro2.fecharLivro();
    }
}