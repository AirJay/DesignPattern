package builder;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameDirector gd = new GameDirector();
		Game game = gd.constructGame(new SexAndCityGameBuilder());
		
		System.out.println(game);
		

	}

}
