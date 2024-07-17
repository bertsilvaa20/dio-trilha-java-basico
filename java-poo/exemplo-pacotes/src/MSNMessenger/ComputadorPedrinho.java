package MSNMessenger;

public class ComputadorPedrinho {
	
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		
		System.out.println("\n--MSN--");
		
        msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		
		System.out.println("\n--FACEBOOK--");
		
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		
		System.out.println("\n--TELEGRAM--");
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}

}
