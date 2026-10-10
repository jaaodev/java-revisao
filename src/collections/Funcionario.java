package collections;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (salario <= 0) {
            throw new IllegalArgumentException("O salário precisa ser maior que zero!");
        }

        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

}
