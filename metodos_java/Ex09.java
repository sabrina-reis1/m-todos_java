public class Ex09 {
	  public static void main(String[] args) {
	        String palavra = "crescer";

	        if (Palindromo(palavra)) {
	            System.out.printf("%s é um palíndromo.", palavra);
	        } else {
	            System.out.printf("%s não é um palíndromo.", palavra);
	        }
	    }

	    public static boolean Palindromo(String str) {
	        str = str.toLowerCase();

	        int i = 0;
	        int j = str.length() - 1;

	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }

	        return true; 
	    }
}
