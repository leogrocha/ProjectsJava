package ListasSetsMapsAlura.Objetos;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private int qtde_aulas = 0;

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.qtde_aulas++;
	}
	
	public int getQuantidadeAulas() {
		return this.qtde_aulas;
	}

	public int getTempoTotal() {
//		int sum = 0;
//		
//		for(int i = 0; i < aulas.size(); i++) {
//			sum += aulas.get(i).getTempo();
//		}
//		
//		return sum;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," + "aulas: " + this.aulas + "]";
	}
	
	
	
	

}
