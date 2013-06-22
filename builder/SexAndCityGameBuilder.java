package builder;

public class SexAndCityGameBuilder implements GameBuilder{

	private Game game;
	
	public SexAndCityGameBuilder(){
		game = new Game();
	}
	public void buildTitle() {
		game.setTitle("SexAndCity");
		
	}

	public void buildContent() {
		game.setContent("This happens five yes ago...");
		
	}

	public void buildEnd() {
		game.setEnd("Every lives happy!");
		
	}
	
	public Game buildGame(){
		return game;
		
	}

}
