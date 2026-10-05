import java.util.ArrayList;

public class Revisao01 {

    public static int calcularDobro(int num) {
        num = num * 2;
        return num;
    }

    public static void main(String[] args) {
        String nome = "João";
        int idade = 27;
        double altura = 1.76;

        System.out.println("Olá, meu nome é "
                            +nome +" tenho "
                            +idade+" anos e "
                            +altura+"m de altura.");

        double salario = 2500.00;
        if (salario > 2000) {
            System.out.println("Meu salário é acima de 2000.");
        } else {
            System.out.println("Meu salário é igual ou menor que 2000.");
        }

        System.out.println("--------------------");

        for (int i=2; i<=20; i+=2) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        int num = 15;
        int res = calcularDobro(num);
        System.out.println("O dobro de "+num+" é: "+res);

        System.out.println("--------------------");

        int numeros[] = {10, 20, 30, 40, 50};

        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("--------------------");

        int soma = 0;

        for (int i=0; i<numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma é: "+soma);

        System.out.println("--------------------");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Shamira");
        nomes.add("Gustavin");
        nomes.add("Maria");
        nomes.add("Ana");

        for (int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }

}
