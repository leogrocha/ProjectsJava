package Classes.Contas;

public class TestaContas {
	public static void main(String[] args) {
		Contas pessoa1 = new ContaPessoaFisica(1,"Seu Madruga", 18035, 6, 200.00, "12345678899", true, 10000.00);
		Contas pessoa2 = new ContaPessoaFisica();
		Contas pessoa3 = new ContaPessoaJuridica(1,"Seu Madruga", 18035, 6, 200.00, "123456799-000", false, 0.00);
		pessoa2.setId(1);
		pessoa2.setNome("Chaves");
		pessoa2.setNumero_conta(102030);
		pessoa2.setDv(4);
		pessoa2.setSaldo(100.00);
		
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
		pessoa1.sacar(100.00);
		pessoa1.mostrarSaldo();
		pessoa1.depositar(200.00);
		pessoa1.mostrarSaldo();
		
		pessoa3.depositar(200.00);
		pessoa3.mostrarSaldo();
		pessoa3.sacar(100.00);
		pessoa3.mostrarSaldo();
		
		System.out.println(pessoa1.solicitaEmprestimo(5000.00));
		System.out.println(pessoa1.solicitaEmprestimo(6000.00));
		pessoa3.statusEmprestimo();
		pessoa1.statusEmprestimo();
		pessoa1.limiteEmprestimo();
		
		
			
	}
}
