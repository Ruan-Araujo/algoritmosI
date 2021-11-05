package notas;

public class TestaMerge {

    public static void main(String[] args) {

        Nota[] notasDoMauricio = {
                new Nota("Andre", 4),
                new Nota("Mariana", 9),
                new Nota("Carlos", 8.5),
                new Nota("Paulo", 9)
        };

        Nota[] notasDoAlberto = {
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Guilherme", 7),
                new Nota("Lucia", 9.3),
                new Nota("Ana", 10)
        };

        Nota[] rank = intercala(notasDoMauricio, notasDoAlberto);

        for (
                Nota nota : rank) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static Nota[] intercala(Nota[] notas1, Nota[] notas2) {
        int total = notas1.length + notas2.length;
        Nota[] resultado = new Nota[total];

        int atual1 = 0;
        int atual2 = 0;
        int atual = 0;

        while (atual1 < notas1.length &&
               atual2 < notas2.length) {

            Nota nota1 = notas1[atual1];
            Nota nota2 = notas2[atual2];
            System.out.println("Estou comparando " + nota1.getAluno() + " com " + nota2.getAluno());

            if (nota1.getValor() < nota2.getValor()) {
                resultado[atual] = nota1;
                atual1++;
                atual++;
            } else {
                resultado[atual] = nota2;
                atual2++;
                atual++;
            }
        }

        System.out.println("Estou saindo do Loop");

        while (atual1 < notas1.length) {
            resultado[atual] = notas1[atual1];
            atual1++;
            atual++;
        }

        while (atual2 < notas2.length) {
            resultado[atual] = notas2[atual2];
            atual++;
            atual2++;
        }

        return resultado;
    }
}

