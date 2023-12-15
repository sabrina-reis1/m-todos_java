import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 6, 9, 12};

        ordenarCrescente(numeros);

        System.out.printf("Numeros em ordem crescente: ", Arrays.toString(numeros));
    }

    public static void ordenarCrescente(int[] array) {
        Arrays.sort(array);
    }
}
