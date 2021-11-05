package notas;

public class TestaEncontraMenores {

    public static void main(String[] args) {
        Nota[] notas = {
                new Nota("Andre", 4),
                new Nota("Carlos", 8.5),
                new Nota("Paulo", 9.000001),
                new Nota("Mariana", 9),
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Guilherme", 7),
                new Nota("Lucia", 9.3),
                new Nota("Ana", 10)
        };

        int menores = encontraMenores(notas[2], notas);
        System.out.println("Número de menores: " + menores);
    }

    private static int encontraMenores(Nota busca, Nota[] notas) {

        int menores= 0;
        for (int atual = 0; atual < notas.length; atual++) {
            Nota nota = notas[atual];
            if (nota.getValor() < busca.getValor()) {
                menores++;
            }
        }
        return menores;
    }
}
