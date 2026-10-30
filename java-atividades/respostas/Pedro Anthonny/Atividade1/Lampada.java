public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Estado: " + (ligada ? "Ligada" : "Desligada"));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 60;

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 40;

        lampada1.ligar();
        lampada2.desligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}