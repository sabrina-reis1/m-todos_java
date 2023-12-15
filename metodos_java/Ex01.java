public class Ex01 {
    public static void main(String[] args) {
        int numero1 = 25;
        int numero2 = 25;

        int resultado = soma(numero1, numero2);

        System.out.printf("O resultado da soma é: ", resultado);
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
}
