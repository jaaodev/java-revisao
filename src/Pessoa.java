public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa () {
    }

    public Pessoa (String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + ", tenho " + this.idade + " anos e " + this.altura + "m de altura.");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade>=0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
