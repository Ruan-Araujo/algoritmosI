package AlgoritmosOrdenacao;

public class SelectionSort {

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static void selectionSort(Produto[] produtos, int quantidadeElementos) {

        for (int atual = 0; atual < quantidadeElementos - 1; atual++) {

            System.out.println("Estou no índice " + atual);

            int menor = buscaMenor(produtos, atual, quantidadeElementos - 1);

            System.out.println("Trocando " + atual + " com o " + menor);

            troca(produtos, atual, menor);
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

            selectionSort(produtos, produtos.length);

            for(Produto produto : produtos) {
                System.out.println(produto.getNome() + " custa " + produto.getPreco());
            }
    }
}
