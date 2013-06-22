package adaptor;

import java.util.HashMap;

public class GameAdaptor implements IGame{
	
	private CRDCGame crdcGame;
	
	private static HashMap<Integer, String> mapping = new HashMap<Integer, String>();
	
	static{
		mapping.put(1, "Star War");
		mapping.put(2, "Supper Man");
	}
	
	public GameAdaptor(CRDCGame crdcGame){
		this.crdcGame = crdcGame;
		
	}

	public void play(int code) {
		crdcGame.play(mapping.get(code));
		
	}
	
	

}
