package interfaceEClasseAbstrata;

public class Gerente extends Funcionario implements Bonificavel {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + getNome() + ", gerente e recebo R$" + getSalario() + ".");
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 20 / 100;
        System.out.println("O meu bonus é de R$" + bonus);
        return bonus;
    }

}
