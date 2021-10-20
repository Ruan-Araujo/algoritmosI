package Salario;

public class Salarios {

    private final String nome;
    private final double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Salarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
