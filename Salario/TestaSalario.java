package Salario;

public class TestaSalario {

    public static void main(String[] args) {

        Salarios[] salario = {
                new Salarios("Fernando", 3200.00),
                new Salarios("Alfredo", 6000),
                new Salarios("Flavio", 5000),
                new Salarios("Marcela", 2200)
        };

        int menorSalario = 0;
        int maiorSalario = 0;

        for (int atual = 0; atual <= 3; atual++) {
            if (salario[atual].getSalario() < salario[menorSalario].getSalario()) {
                menorSalario = atual;
            }

            if (salario[atual].getSalario() > salario[maiorSalario].getSalario()) {
                maiorSalario = atual;
            }
        }
        System.out.println(maiorSalario);
        System.out.println("O maior salário é " + salario[maiorSalario].getSalario());
        System.out.println(menorSalario);
        System.out.println("O menor salário é " + salario[menorSalario].getSalario());
    }
}
