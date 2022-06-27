package EstuturaDeDadosAlura.Lista;

public class Lista {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;

		if (this.totalDeElementos == 0) {
			this.ultima = primeira;
		}

		this.totalDeElementos++;
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();

	}

	public void adiciona(Object elemento) {

		if (this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			// Criando a nova Celula que n�o vai possuir pr�ximo elemento pois � a ultima
			Celula nova = new Celula(elemento, null);
			// Setando a vari�vel que antes era �ltima para receber a nova 
			this.ultima.setProximo(nova);
			// Informando que a nova agora � a ultima
			this.ultima = nova;

			this.totalDeElementos++;
		}

	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inexistente");
		}
		
		Celula atual = primeira;
		
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}

	public void adiciona(int posicao, Object elemento) {
		
		if(posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			adiciona(elemento);
		} else {
			// Pega o valor anterior a posi��o selecionada
			Celula anterior = this.pegaCelula(posicao - 1);
			// Inseri o novo elemento adicionando a sua refer�ncia de proximo igual ao elemento anterior
			Celula nova = new Celula(elemento, anterior.getProximo());
			// Alterando a referencia do elemento anterior para agora o nova ser o proximo dele
			anterior.setProximo(nova);
			this.totalDeElementos++;			
		}
		
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		// Fazendo com que agora o segundo elemento passe a ser o primeiro
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void remove(int posicao) {
		
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object o) {
		return false;
	}

}
