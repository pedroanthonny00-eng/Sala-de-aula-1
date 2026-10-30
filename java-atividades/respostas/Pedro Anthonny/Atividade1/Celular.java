public class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println(marca + " " + modelo + " ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("-----------------------");
    }

    void carregarBateria() {
        System.out.println("Carregando " + marca + " " + modelo + "...");
        while (bateria < 100) {
            bateria = bateria + 10;
            if (bateria > 100) {
                bateria = 100;
            }
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Bateria completa!");
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S23";
        celular1.bateria = 60;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "Moto G";
        celular2.bateria = 30;

        celular1.ligar();
        celular2.ligar();

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        celular1.carregarBateria();
        celular2.carregarBateria();
    }
}