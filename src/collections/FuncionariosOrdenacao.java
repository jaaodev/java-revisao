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

        System.out.println("--- Salários menores ou iguais a 4500 ---");
        funcionarios.stream()
                .filter(f -> f.getSalario() <= 4500)
                .forEach(f -> System.out.println(
                        f.getNome() + " - " + f.getSalario()));

        System.out.println(" --- LISTA DE FUNCIONARIOS FILTRADOS COM toList");
        List<Funcionario> funcionariosFiltrados = funcionarios.stream()
                .filter(f -> f.getSalario()>4000)
                .toList();
        funcionariosFiltrados
                .forEach(f -> System.out.println(
                        f.getNome() + " - " + f.getSalario()));
        System.out.println("-------------------------");
        System.out.println("Total original: " + funcionarios.size());
        System.out.println("Total filtrado: " + funcionariosFiltrados.size());

        System.out.println("................................");
        System.out.println("Funcionários com salário acima de 4000");
        List<String> nomesBemPagos = funcionarios.stream()
                .filter(f -> f.getSalario() > 4000)
                .map(f -> f.getNome())
                .toList();
        nomesBemPagos.forEach(nomes -> System.out.println(nomes));



    }
}
