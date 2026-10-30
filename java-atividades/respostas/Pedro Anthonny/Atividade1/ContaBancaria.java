public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor);
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Maria Silva";
        conta1.numeroConta = 12345;
        conta1.saldo = 0;

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.sacar(1000);
        conta1.exibirSaldo();
    }
}