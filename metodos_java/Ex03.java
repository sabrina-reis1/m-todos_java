public class Ex03 {
    public static void main(String[] args) {
        double[] numeros = { 1, 2, 2.5, 3, 4};

        double media = calcularMedia(numeros);

        System.out.printf("A média dos números é: ", media);
    }

    public static double calcularMedia(double[] numeros) {

        double soma = 0.0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }
}
