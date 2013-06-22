package state;

public class GamePlay {

	public void play(GameContext gameContext){
		getProcess(gameContext);
		
		gameContext.getGamePlay().play(gameContext);
	}
	
	public static void getProcess(GameContext gameContext){
		
		switch(gameContext.getCurrentState()){
		case BASE_GAME:
			gameContext.setGamePlay(new BaseGame());
			break;
		case BONUS_GAME:
			gameContext.setGamePlay(new BonusGame());
			break;
		}
		
	}
}
