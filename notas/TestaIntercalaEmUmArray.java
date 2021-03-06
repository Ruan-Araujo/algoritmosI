package notas;

public class TestaIntercalaEmUmArray {

    public static void main(String[] args) {
        Nota[] notasEmUmArray = {
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

        ordena(notasEmUmArray, 0, notasEmUmArray.length);
        for (Nota nota : notasEmUmArray) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static void ordena(Nota[] notas, int inicial, int termino) {

        int quantidade = termino - inicial;
        if (quantidade > 1) {

            int meio = (inicial + termino) / 2;
            ordena(notas, inicial, meio);
            ordena(notas, meio, termino);
            intercala(notas, inicial, meio, termino);

        }
    }

    private static Nota[] intercala(Nota[] notas, int inicial, int miolo, int termino) {
        Nota[] resultado = new Nota[termino - inicial];
        int atual = 0;
        int atual1 = inicial;
        int atual2 = miolo;

        while (atual1 < miolo && atual2 < termino) {
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if (nota1.getValor() < nota2.getValor()) {
                resultado[atual] = nota1;
                atual1++;
            } else {
                resultado[atual] = nota2;
                atual2++;
            }
            atual++;
        }

        while (atual1 < miolo) {
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }

        while (atual2 < termino) {
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }

        for (int contador = 0; contador < atual; contador++) {
            notas[inicial + contador] = resultado[contador];
        }

        return notas;
    }
}
