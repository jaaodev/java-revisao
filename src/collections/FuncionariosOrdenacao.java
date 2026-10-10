package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionariosOrdenacao {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 6000));
        funcionarios.add(new Funcionario("João", 3000));
        funcionarios.add(new Funcionario("Maria", 4500));

        funcionarios.sort(
                Comparator.comparingDouble((Funcionario f) -> f.getSalario()).reversed()
        );

        funcionarios.forEach(
                f -> {
                    System.out.println("Funcionário: " + f.getNome());
                    System.out.println("Salário: " + f.getSalario());
                    System.out.println("------------------");
                });

    }
}
