public class Ex02 {
    public static void main(String[] args) {
        int numero = 11;

        if (numPrimo(numero)) {
            System.out.printf("É um número primo", numero);
        } else {
            System.out.printf("Não é um número primo", numero);
        }
    }

    public static boolean numPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
