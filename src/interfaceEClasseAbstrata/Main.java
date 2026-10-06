package interfaceEClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("João", 5000);
        Gerente gerente = new Gerente("Shamira", 8000);

        programador.apresentar();
        programador.calcularBonus();

        gerente.apresentar();
        gerente.calcularBonus();

        Funcionario funcionario1 = new Programador("João", 5000);
        Funcionario funcionario2 = new Gerente("Shamira", 8000);

        funcionario1.apresentar();
        funcionario2.apresentar();

    }
}
