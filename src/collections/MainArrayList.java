package collections;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            funcionarios.add(new Funcionario("João", 2000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            funcionarios.add(new Funcionario("Maria", 3500));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            funcionarios.add(new Funcionario("Carlos", 6000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        double somaSalario = 0;

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - R$" + f.getSalario());
            somaSalario += f.getSalario();
        }
        System.out.println("Total dos salários: R$ " + somaSalario);

        String nomeBusca = "Pedro";
        boolean encontrado = false;

        for (Funcionario f : funcionarios) {
            if (nomeBusca.equalsIgnoreCase(f.getNome())) {
                System.out.println(f.getNome() + " - R$" + f.getSalario());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado!");
        }

    }
}
