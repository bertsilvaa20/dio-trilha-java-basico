package pilarespoo;

public class Autodromo {
	
	public static void main(String[] args) {
		
		Carro jeep = new Carro();
        jeep.setChassi("897897");
		//jeep.ligar();
				
		Moto z400 = new Moto();
		z400.setChassi("896896");
		//z400.ligar();
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
		
		System.out.println("\nPlaca do carro: " + jeep.getChassi());
		System.out.println("Placa da moto: " + z400.getChassi());
		
	}

}
