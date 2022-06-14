package String;

public class CompareToAndCompareToIgnoreCase {
	/*
	 * Ambos fazem compara��o de duas Strings, sendo que o primeiro (compareTo) considera
	 * letras maiusculas e min�sculas na compara��o j� o segundo ignora qualquer diferen�a
	 * de minuscula ou maiscula. Ambos tamb�m retornam a quantidade de diferen�as, sendo que
	 * nos importa saber, no momento, que quando o retorno for igual a zero significa que n�o 
	 * h� diferen�as entre a String.
	 * */
	
	public static void main(String[] args) {
		String valor = "Java";
		
		System.out.println(valor.compareTo("Java") == 0 ? true : false); // true
		System.out.println(valor.compareTo("java") == 0 ? true : false); // false
		System.out.println(valor.compareToIgnoreCase("Java") == 0 ? true : false); // true
		
	}
}
