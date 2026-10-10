package collections;

import java.util.HashSet;
import java.util.Set;

public class CadastroParticipantesHashSet {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();

        participantes.add("Maria");
        participantes.add("Carlos");
        participantes.add("João");
        participantes.add("Ana");
        participantes.add("Maria");
        boolean adicionou = participantes.add("João");
        System.out.println("Participantes cadastrados: ");

        for (String p : participantes) {
            System.out.println(p);
        }
        System.out.println("A quantidade total de participantes é: " + participantes.size());


        String nomeBusca = "Pedro";

        if (participantes.contains(nomeBusca)) {
            System.out.println("Participante cadastrado!");

        } else {
            System.out.println("Participante não cadastrado!");
        }

    }
}
