package builder;

public class GameDirector {
	
	
	public Game constructGame(GameBuilder gb){
		
		gb.buildTitle();
		gb.buildContent();
		gb.buildEnd();
		return gb.buildGame();
	}

}
