public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(-27);
        pessoa1.setAltura(1.76);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Shamira");
        pessoa2.setIdade(24);
        pessoa2.setAltura(1.57);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("------------");

        pessoa1.apresentar();
        pessoa2.apresentar();
        System.out.println("------------");

        Pessoa pessoa3 = new Pessoa("Gustavin", 24, 1.65);
        pessoa3.apresentar();
        System.out.println("------------");

        Funcionario funcionario1 = new Funcionario("Mario", 19, 1.70, 3500);
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Altura: " + funcionario1.getAltura());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("------------");
        funcionario1.apresentar();

        System.out.println("------------");

        Pessoa funcionario2 = new Funcionario("Carlos", 30, 1.80, 5000);
        funcionario2.apresentar();
    }
}
