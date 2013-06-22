package state;

/**
 *  A test client
 */
public class Test  {
    public static void main(String[] args) {
    	
    	GameContext gameContext = new GameContext(GameState.BASE_GAME, GameState.BONUS_GAME);
    	
    	GamePlay gamePlay = new GamePlay();
    	
    	gamePlay.play(gameContext);
    	gamePlay.play(gameContext);
    	
//    	gameContext.changeState(GameState.BONUS_GAME);
    	gameContext.setCurrentState(GameState.BONUS_GAME);
    	gameContext.setNextState(GameState.BASE_GAME);
    	gamePlay.play(gameContext);
    	gamePlay.play(gameContext);
    	
    	
        
    }
}