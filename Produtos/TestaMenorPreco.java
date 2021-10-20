package Produtos;

public class TestaMenorPreco {

    private static int maisBarato(Carros[] carros, int inicio, int termino) {
        int maisBarato = inicio;

        for(int atual = inicio; atual <= termino; atual++){
            if(carros[atual].getPreco() < carros[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }


    public static void main(String[] args) {

        Carros[] carros = {
                new Carros("Lamborghini", 1000000),
                new Carros("Jipe", 46000),
                new Carros("Brasilia", 16000.001),
                new Carros("Smart", 46000),
                new Carros("Fusca", 16000.01)
        };

        int maisBarato = maisBarato(carros, 0, 4);

        System.out.println(maisBarato);
        System.out.println(carros[maisBarato].getNome() +
                            " é o carro mais barato e custa R$ "
                            + carros[maisBarato].getPreco());
    }
}
