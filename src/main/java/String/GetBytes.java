package String;

public class GetBytes {
	/*
	 * Converte a String em um vetor de byte[]. Este m�todo � muito �til principalmente
	 * quando precisamos salvar caracteres no banco desconsiderando a codifica��o atual. 
	 * */
	
	public static void main(String[] args) {
		String valor = "java";
		
		for(byte b : valor.getBytes()) {
			System.out.println("byte: " + b);
		}
	}
}
