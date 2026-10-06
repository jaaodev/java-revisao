package interfaceEClasseAbstrata;

public class Programador extends Funcionario implements Bonificavel{

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + getNome() + ", programador e recebo R$" + getSalario() + ".");
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 10 / 100;
        System.out.println("O meu bonus é de R$" + bonus);
        return bonus;
    }

}
