package String;

public class isEmpty {
	/*
	 * Um m�todo muito utilizado e comum que verifica se uma String est� ou n�o vazia, mas
	 * tenha aten��o neste m�todo, pois a verifica��o baseia-se se sua String possui tamanho = 0,
	 * ou seja, o String.length() = 0. Isso significa que caso voc� tente utilizar o IsEmpty() em
	 * uma String que possui valor NULL voc� receber� um NullPointerException.
	 * 
	 * */
	
	public static void main(String[] args) {
		String valor = "";
		System.out.println(valor.isEmpty()); // true
	}
}
