package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class FuncionariosOrdenacaoEStreamAPI {
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

        System.out.println("---------- count() ------------");
        Long quantidadeBemPagos = funcionarios.stream()
                .filter(f -> f.getSalario() > 4000).count();
        System.out.println("A quantidade de funcionarios com salario acima de R$4000 é: " + quantidadeBemPagos);

        System.out.println("---------- mapToDouble() ------------");
        double somaSalarios = funcionarios.stream()
                .mapToDouble(f -> f.getSalario())
                .sum();
        System.out.println("A soma dos salários é: R$" + somaSalarios);

        double mediaSalarial = funcionarios.stream()
                .mapToDouble(f -> f.getSalario())
                .average().orElse(0.0);
        System.out.println("A média dos salários é: R$" + mediaSalarial);
        //O OptionalDouble é um objeto que pode estar com ou sem valor.
        //Para imprimir apenas o valor númerico é preciso utilizar .getAsDouble() ou .orElse(0.0)
        //.orElse(0.0) a lógica é que se tiver uma média use ela, se não use 0.0
        double menorSalario = funcionarios.stream()
                .mapToDouble(f -> f.getSalario()).min()
                .orElse(0.0);
        System.out.println("O menor salário é: R$" + menorSalario);
        double maiorSalario = funcionarios.stream()
                .mapToDouble(f -> f.getSalario()).max()
                .orElse(0.0);
        System.out.println("O maior salário é: R$" + maiorSalario);

        System.out.println("-------- Desafio Análise de salários com Stream API --------");
        long quantidadeSalariosAltos = funcionarios.stream()
                .filter(f -> f.getSalario() >= 4000)
                .count();
        double mediaSalariosAltos = funcionarios.stream()
                .filter(f -> f.getSalario() >= 4000)
                .mapToDouble(f -> f.getSalario())
                .average()
                .orElse(0.0);
        List<String> nomesSalariosAltos = funcionarios.stream()
                .filter(f -> f.getSalario() >= 4000)
                .map(f -> f.getNome())
                .toList();
        System.out.println("Quantidade: " + quantidadeSalariosAltos);
        System.out.println("Média: " + mediaSalariosAltos);
        System.out.println("Nomes: ");
        nomesSalariosAltos.forEach(nomes -> System.out.println(nomes));

    }
}
