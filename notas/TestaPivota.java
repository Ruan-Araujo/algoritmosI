package notas;

public class TestaPivota {

    public static void main(String[] args) {

        Nota guilherme = new Nota("Guilherme", 7);

        Nota[] notas = {
                new Nota("Andre", 4),
                new Nota("Carlos", 8.5),
                new Nota("Paulo", 9.000001),
                new Nota("Mariana", 9),
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Lucia", 9.3),
                new Nota("Ana", 10),
                guilherme
        };

        int novaPosicao = quebraNoPivo(notas, 0, notas.length - 1);
        System.out.println("O pivo foi parar em: " + novaPosicao);

        for (int atual = 0; atual < notas.length; atual++) {

            Nota nota = notas[atual];
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static int quebraNoPivo(Nota[] notas, int inicial, int termino) {

        Nota pivo = notas[termino - 1];

        int menoresEncontrados = 0;

        for (int analisando = 0; analisando < termino - 1; analisando++) {

            Nota atual = notas[analisando];
            if (atual.getValor() <= pivo.getValor()) {
                troca(notas, analisando, menoresEncontrados);
                menoresEncontrados++;
            }
        }

        troca(notas, termino - 1, menoresEncontrados);
        return menoresEncontrados;
    }

    private static void troca(Nota[] notas, int de, int para) {

        Nota nota1 = notas[de];
        Nota nota2 = notas[para];
        notas[para] = nota1;
        notas[de] = nota2;

    }


}
