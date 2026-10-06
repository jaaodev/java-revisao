public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, int idade, double altura, double salario) {
        super(nome, idade, altura);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() + " anos e " + getAltura() +
                "m de altura, e o meu salário é de R$" + getSalario() + ".");
    }

}
