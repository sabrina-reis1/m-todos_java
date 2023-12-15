package comMetodosNaLinguagemDeProgramacaoJava;

public class Ex05 {
    public static void main(String[] args) {
        String texto = "Tá facil, jaja?";

        int quantidadeVogais = contarVogais(texto);

        System.out.println("A quantidade de vogais no texto é: " + quantidadeVogais);
    }

    public static int contarVogais(String texto) {

        int countVogais = 0;
        String vogais = "aeiou";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                countVogais++;
            }
        }

        return countVogais;
    }
}
