package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRevisao {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(
                10, 5, 20, 10, 3, 8, 20, 15, 2
        );
        List<Integer> resultado1 = numeros.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .toList();
        resultado1.forEach(
                n -> System.out.println(n)
        );

        System.out.println("------");

        List<Integer> resultado2 = numeros.stream()
                .map(n -> n * 2)
                .filter(n -> n > 5)
                .distinct()
                .sorted()
                .toList();
        resultado2.forEach(
                n -> System.out.println(n)
        );

        System.out.println("---- limit() ----"); //selecionar os primeiros
        List<Integer> numeros2 = List.of(
                50, 10, 30, 20, 40, 60
        );

        List<Integer> resultado3 = numeros2.stream()
                .sorted()
                .limit(3)
                .toList();
        resultado3.forEach(
                n -> System.out.println(n)
        );

        System.out.println("---- skip() ----"); //ignorar os primeiros
        List<Integer> resultado4 = numeros2.stream()
                .sorted()
                .skip(2)
                .toList();
        resultado4.forEach(
                n -> System.out.println(n)
        );

        System.out.println("----EXERCICIO----");

        //Seu objetivo é criar uma nova lista com os 3 maiores valores, sem repetição, do maior para o menor.
        List<Integer> numeros3 = List.of(
                12, 45, 7, 30, 60, 18, 45, 90, 25
        );
        List<Integer> resultado5 = numeros3.stream()
                .distinct() //tirar os numeros duplicados
                .sorted(Comparator.reverseOrder()) //ordenar do maior para o menor
                .limit(3) //pegar somente os três primeiros valores da lista
                .toList(); //criar uma nova lista
        resultado5.forEach(
                n -> System.out.println(n)
        );

        System.out.println("---- findFirst() ----"); //procurar o primeiro, apenas o primeiro
        List<Integer> numeros4 = List.of(
                12, 45, 7, 30, 60, 18, 45, 90, 25
        );
        int resultado6 = numeros4.stream()
                .filter(n -> n > 100)
                .findFirst()
                .orElse(-1);
        System.out.println(resultado6);

        int resultado7 = numeros4.stream()
                .filter(n -> n > 20)
                .sorted()
                .findFirst()
                .orElse(0);
        System.out.println(resultado7);

        System.out.println("---- anyMatch, allMatch e noneMatch ----"); // algum, todos, nenhum
        List<Integer> numeros5 = List.of(
                10, 20, 30, 40, 50
        );
        boolean algumMaiorQue45 = numeros5.stream()
                .anyMatch(n -> n > 45);
        System.out.println(algumMaiorQue45);
        boolean todosMaiorQue5 = numeros5.stream()
                .allMatch(n -> n > 5);
        System.out.println(todosMaiorQue5);
        boolean nenhumNegativo = numeros5.stream()
                .noneMatch(n -> n < 0);
        System.out.println(nenhumNegativo);

        System.out.println("---- findAny ----"); //procurar algum, qualquer um server
        int algumNumero = numeros5.stream()
                .filter(n -> n > 25)
                .findAny()
                .orElse(-1);
        System.out.println(algumNumero);

        System.out.println("---- reduce() ----"); //reduce(valor inicial, (acumalador, elemento atual) ->
        List<Integer> numeros6 = List.of(
                5, 10, 15, 20
        );
        int soma = numeros6.stream()
                .reduce(0, (a, n) -> a + n);
        System.out.println(soma);
        int multiplicacao = numeros6.stream()
                .reduce(1, (a, n) -> a * n);
        System.out.println(multiplicacao);
        int maiorNum = numeros6.stream()
                .reduce(0, (a, n) -> a > n ? a : n);
        System.out.println(maiorNum);

        System.out.println("---- collect() e Collectors ----");
        List<String> nomes = List.of(
                "Carlos",
                "Maria",
                "João"
        );
        System.out.println("--joining--");
        String resultadoNomes =
                nomes.stream()
                        .collect(Collectors.joining(" - ")); //o joining pega vários elementos String de uma Stream
        System.out.println(resultadoNomes);                           //e junta tudo dentro de uma única String
        List<String> nomes1 = List.of(
                "Carlos",
                "Maria",
                "João",
                "Ana",
                "Pedro"
        );
        System.out.println("--groupingBy--"); //agrupa elementos em vários grupos de acordo com algum critério.
        Map<Integer, List<String>> resultadoNomes1 =
                nomes1.stream()
                        .collect(Collectors.groupingBy(nome -> nome.length()));
        resultadoNomes1.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
        });
        /*
                uma instrução → chaves opcionais;
                várias instruções → chaves obrigatórias;
                com bloco {} e retorno de valor → geralmente precisa de return.
         */
        System.out.println("--partitioningBy--"); //separa os elementos em apenas dois grupos, usando uma condição booleana.
                                                  //As chaves sempre são true e false.
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Carlos", 6000));
        funcionarios.add(new Funcionario("João", 3000));
        funcionarios.add(new Funcionario("Maria", 4500));
        Map<Boolean, List<Funcionario>> resultadoFuncionarios =
                funcionarios.stream()
                        .collect(Collectors.partitioningBy(
                                f -> f.getSalario() >= 4500
                        ));
        resultadoFuncionarios.forEach((chave, valor) ->
                System.out.println(chave + " - " + valor)
        );

        System.out.println("---- flatMap ----"); //serve para achatar estruturas aninhadas.
        List<List<Integer>> numeros7 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );
        List<Integer> numerosFlatMap =
                numeros7.stream()
                        .flatMap(lista -> lista.stream())
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 10)
                        .sorted()
                        .toList();
        System.out.println(numerosFlatMap);

    }
}
