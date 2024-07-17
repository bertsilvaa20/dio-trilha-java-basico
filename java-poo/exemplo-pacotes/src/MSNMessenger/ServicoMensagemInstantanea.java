package MSNMessenger;

public class ServicoMensagemInstantanea {
	
// a classe MSNMessenger é ou representa
	public void enviarMensagem() {
		// primeiro confirmar se esta conectado a Internet
		validarConectadoInternet();
		System.out.println("\nEnviando mensagem...");
		// depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("\nRecebendo mensagem...");
	}
	
	//métodos privados, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("\nValidando se está conectado a internet...");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem...");
	}

}
