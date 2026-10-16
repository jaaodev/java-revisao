package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionariosSortedEDistinct {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 6000));
        funcionarios.add(new Funcionario("João", 3000));
        funcionarios.add(new Funcionario("Maria", 4500));

        List<Funcionario> funcionariosCrescente = funcionarios.stream()
                .sorted(Comparator.comparingDouble(f -> f.getSalario()))
                .toList();

        funcionariosCrescente.forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));

        List<String> nomes = List.of(
                "Carlos",
                "Maria",
                "Carlos",
                "João",
                "Maria"
        );

        List<String> nomesUnicos = nomes.stream().distinct().toList();
        System.out.println(nomesUnicos);

    }
}
