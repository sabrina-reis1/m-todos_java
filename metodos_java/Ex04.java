public class Ex04 {
    public static void main(String[] args) {
        int num = 12;

        long resultadoFatorial = calcularFatorial(num);

        System.out.printf("O fatorial de %s é: %s ", num, resultadoFatorial);
    }
    public static long calcularFatorial(int num1) {

        long fatorial = 1;

        for (int i = 1; i <= num1; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
