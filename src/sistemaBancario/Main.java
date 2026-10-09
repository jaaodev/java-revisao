package sistemaBancario;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("João", 1000, TipoConta.CORRENTE);

        conta1.depositar(500);
        conta1.sacar(300);

        try {
            conta1.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O saldo final é: R$" + conta1.getSaldo() + " e o tipo da conta é: " + conta1.getTipoConta());
        System.out.println("-------------------         0          ----------------");

        try {
            conta1.depositar(-200);
            conta1.sacar(0);
            conta1.sacar(5000);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
/*
        try {
            conta1.sacar(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta1.sacar(5000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } */

    }
}
