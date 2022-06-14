package String;

public class endsWithAndStartsWith {
	/*
	 * O m�todo endsWith verifica se a String termina com o valor especificado, por outro
	 * lado o startsWith verifica se a String come�a como o valor especificado. Sendo que o m�todo
	 * startsWith tem duas varia��es.
	 * */
	
	public static void main(String[] args) {
		String valor = "DEV Java";
		
		System.out.println(valor.endsWith("Java")); //true
		System.out.println(valor.startsWith("DEV")); //true
		System.out.println(valor.startsWith("E", 1)); //true
	}
	
}
