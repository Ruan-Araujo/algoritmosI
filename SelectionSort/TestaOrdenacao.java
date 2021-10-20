package SelectionSort;

public class TestaOrdenacao {

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static void ordena(Produto[] produtos, int quantidadeElementos) {

        for (int atual = 0; atual < quantidadeElementos - 1; atual++) {

            System.out.println("Estou na casinha " + atual);

            int menor = buscaMenor(produtos, atual, quantidadeElementos - 1);

            System.out.println("Trocando " + atual + " com o " + menor);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];

            System.out.println("Trocando " + produtoAtual.getNome() + " com " + produtoMenor.getNome());

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

    public static void main(String[] args) {

            Produto[] produtos = {
                    new Produto("Lamborghini", 1000000),
                    new Produto("Jipe", 46000),
                    new Produto("Brasilia", 16000.001),
                    new Produto("Smart", 46000),
                    new Produto("Fusca", 16000.01)
            };

            ordena(produtos, produtos.length);

            for(Produto produto : produtos) {
                System.out.println(produto.getNome() + " custa " + produto.getPreco());
            }
    }
}
