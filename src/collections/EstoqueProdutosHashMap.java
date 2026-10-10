package collections;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutosHashMap {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Teclado", 10);
        estoque.put("Mouse", 20);
        estoque.put("Monitor", 5);
        estoque.put("Teclado", 15);

        String produtoBusca = "Cadeira";

        if (estoque.containsKey(produtoBusca)) {
            System.out.println("Produto encontrado!");
            System.out.println("A quantidade de " + produtoBusca + " é: " + estoque.get(produtoBusca));
        } else {
            System.out.println("Produto não encontrado!");
        }

        for (String produto : estoque.keySet()) {
            System.out.println(produto + " - " + estoque.get(produto) + " unidades");
        }

        String produto = "Mouse";
        int quantidadeRecebida = 8;
        System.out.println("Estoque anterior de Mouse: " + estoque.get(produto));
        System.out.println("Quantidade recebida: " + quantidadeRecebida);

        if (estoque.containsKey(produto)) {
            int novoEstoque = quantidadeRecebida + estoque.get(produto);
            estoque.put(produto, novoEstoque);
        }
        System.out.println("Estoque atualizado de Mouse: " + estoque.get(produto));

    }
}
