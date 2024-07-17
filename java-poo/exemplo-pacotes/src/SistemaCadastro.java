
public class SistemaCadastro {
	
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		
		Pessoa marcos = new Pessoa("123.456.789-10", "MARCOS");
		
		marcos.setEndereco("RUA DAS MARIAS, 1328");
		
		System.out.println(marcos.getNome() + " | " + marcos.getCpf() + " | " + marcos.getEndereco());
		
		
	}

}
