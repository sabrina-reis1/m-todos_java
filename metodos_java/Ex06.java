public class Ex06 {
    public static void main(String[] args) {
        int valor1 = 2;
        int valor2 = 10;

        System.out.printf("Valores antes da troca: Valor1 = %s, Valor2 = %s%n", valor1, valor2);

        trocarValores(valor1, valor2);

        System.out.printf("Valores depois da troca: Valor1 = %s, Valor2 = %s%n", valor1, valor2);
    }

    public static void trocarValores(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.printf("Valores trocados: A = %s, B = %s%n",a, b);
    }
}
