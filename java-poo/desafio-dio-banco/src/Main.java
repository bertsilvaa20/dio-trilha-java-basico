
public class Main {
	
	public static void main(String[] args) {
		Cliente robert = new Cliente();
		robert.setNome("Robert");
		
		Conta cc = new ContaCorrente(robert);
		Conta cp = new ContaPoupanca(robert);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
