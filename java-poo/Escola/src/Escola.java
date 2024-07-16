public class Escola extends Estudante{
	
	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		estudante1.nome = "Robert";
		estudante1.idade = 20;
		estudante1.raça = "Branco";
		estudante1.sexo = 'M';
		
		Estudante estudante2 = new Estudante();
		estudante2.nome = "Julia";
		estudante2.idade = 19;
		estudante2.raça = "Morena";
		estudante2.sexo = 'f';
		
		Estudante estudante3 = new Estudante();
		estudante3.nome = "João";
		estudante3.idade = 21;
		estudante3.raça = "Negro";
		estudante3.sexo = 'm';
		
		//IMPRIMINDO INFORMAÇÕES DO ALUNO 1
		
		System.out.println("Nome do aluno 1: " + estudante1.nome);
		System.out.println("Idade do aluno 1: " + estudante1.idade);
		System.out.println("Raça do aluno 1: " + estudante1.raça);
		
		if (estudante1.sexo == 'M' || estudante1.sexo == 'm') {
			System.out.println("Sexo do aluno 1: Masculino\n");
		}
		else if (estudante1.sexo == 'F' || estudante1.sexo == 'f') {
			System.out.println("Sexo do aluno 1: Feminino\n");
		}
		
		//IMPRIMINDO INFORMAÇÕES DO ALUNO 2
		
		System.out.println("Nome do aluno 2: " + estudante2.nome);
		System.out.println("Idade do aluno 2: " + estudante2.idade);
		System.out.println("Raça do aluno 2: " + estudante2.raça);
		
		if (estudante2.sexo == 'M' || estudante2.sexo == 'm') {
			System.out.println("Sexo do aluno 2: Masculino\n");
		}
		else if (estudante2.sexo == 'F' || estudante2.sexo == 'f') {
			System.out.println("Sexo do aluno 2: Feminino\n");
		}
		
		//IMPRIMINDO INFORMAÇÕES DO ALUNO 3
		
		System.out.println("Nome do aluno 3: " + estudante3.nome);
		System.out.println("Idade do aluno 3: " + estudante3.idade);
		System.out.println("Raça do aluno 3: " + estudante3.raça);
		
		if (estudante3.sexo == 'M' || estudante3.sexo == 'm') {
			System.out.println("Sexo do aluno 3: Masculino\n");
		}
		else if (estudante3.sexo == 'F' || estudante3.sexo == 'f') {
			System.out.println("Sexo do aluno 3: Feminino\n");
		}


	}
		
	}