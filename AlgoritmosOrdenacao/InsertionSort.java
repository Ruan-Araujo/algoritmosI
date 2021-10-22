package AlgoritmosOrdenacao;

public class InsertionSort {

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static void insertionSort(Produto[] produtos, int quantidadeElementos) {

        for (int atual = 0; atual < quantidadeElementos; atual++) {

            System.out.println("Estou no índice " + atual);
            
            int analise = atual;

            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {

                troca(produtos, analise, analise - 1);
                analise--;
            }
            imprimeProdutos(produtos);
            System.out.println();
            System.out.println();
        }
    }


    private static void troca(Produto[] produtos, int primeiro, int segundo) {

        System.out.println("Estou trocando " + primeiro + " com " + segundo);
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];
        System.out.println("Estou trocando " + primeiroProduto.getNome() + " com " + segundoProduto.getNome());
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    public static void main(String[] args) {

        Produto[] produtos = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000.001),
                new Produto("Smart", 46000),
                new Produto("Fusca", 16000.01)
        };

        insertionSort(produtos, produtos.length);

        imprimeProdutos(produtos);
    }

    private static void imprimeProdutos(Produto[] produtos) {
        for(Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

}
