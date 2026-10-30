public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura < 30) {
            temperatura++;
        } else {
            System.out.println("Temperatura já está no máximo (30 °C).");
        }
    }

    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura > 16) {
            temperatura--;
        } else {
            System.out.println("Temperatura já está no mínimo (16 °C).");
        }
    }

    void exibirEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Midea";
        ar.temperatura = 24;

        ar.aumentarTemperatura();
        ar.ligar();
        ar.exibirEstado();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.exibirEstado();

        ar.temperatura = 17;
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.exibirEstado();

        ar.desligar();
    }
}