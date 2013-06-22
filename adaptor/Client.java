package adaptor;

public class Client {
	
	public static void main(String[] args){
		GameAdaptor ga = new GameAdaptor(new CRDCGame());
		
		ga.play(1);
	}

}
