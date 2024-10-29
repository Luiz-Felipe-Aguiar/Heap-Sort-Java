import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        int[] array = {3, 1, 5, 2, 4, 9, 8, 7, 10};

        int[] arrayOrdenado = arvore.adicionaEOrdena(array);

        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenado));
    }
}
