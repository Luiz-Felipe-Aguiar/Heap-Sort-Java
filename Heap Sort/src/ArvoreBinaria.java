public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Método para adicionar um elemento na árvore
    public void adiciona(T elemento) {
        raiz = adicionaRecursivo(raiz, elemento);
    }

    private No<T> adicionaRecursivo(No<T> atual, T elemento) {
        if (atual == null) {
            return new No<>(elemento);
        }

        if (elemento.compareTo(atual.getElemento()) < 0) {
            atual.setEsquerda(adicionaRecursivo(atual.getEsquerda(), elemento));
        } else if (elemento.compareTo(atual.getElemento()) > 0) {
            atual.setDireita(adicionaRecursivo(atual.getDireita(), elemento));
        }

        return atual;
    }

    // Novo método para adicionar elementos de um array e ordenar usando heap sort
    public int[] adicionaEOrdena(int[] array) {
        // Adiciona elementos do array na árvore binária
        for (int elemento : array) {
            adiciona((T) Integer.valueOf(elemento));
        }

        // Implementa heap sort no array
        int n = array.length;

        // Constroi o heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrai elementos do heap um por um
        for (int i = n - 1; i >= 0; i--) {
            // Move a raiz atual para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    // Método para empilhar
    private void heapify(int[] array, int n, int i) {
        int maior = i; // Inicializa maior como raiz
        int esquerda = 2 * i + 1; // Esquerda = 2*i + 1
        int direita = 2 * i + 2; // Direita = 2*i + 2

        // Se o filho da esquerda é maior que a raiz
        if (esquerda < n && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Se o filho da direita é maior que o maior até agora
        if (direita < n && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se o maior não é a raiz
        if (maior != i) {
            int swap = array[i];
            array[i] = array[maior];
            array[maior] = swap;

            //empilha a subárvore afetada
            heapify(array, n, maior);
        }
    }

    @Override
    public String toString() {
        return "ArvoreBinaria{" +
                "raiz=" + raiz +
                '}';
    }
}
