package sistemaBancario;

public class Conta implements OperacoesBancarias {

    @Override
    public void depositar(double valor){
        if (valor<=0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        } this.saldo += valor;
        System.out.println("Depósito realizado: R$"+valor);
    }

    @Override
    public void sacar(double valor){
        if (valor<=0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        if (valor>this.saldo) {
            throw new SaldoInsuficienteException();
        } saldo -= valor;
        System.out.println("Saque realizado: R$"+valor);
    }

     private String titular;
     private double saldo;
     private TipoConta tipoConta;

    public Conta(String titular, double saldo, TipoConta tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public TipoConta getTipoConta() {
        return this.tipoConta;
    }

}
