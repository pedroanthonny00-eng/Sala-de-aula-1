public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println(modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado!");
        } else {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2022;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.exibirInformacoes();
        carro1.desligar();

        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.desligar();
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}