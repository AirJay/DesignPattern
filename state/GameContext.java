package state;

public class GameContext {
	private GameState currentState;
	private GameState nextState;
	private GamePlay gamePlay;
	
	public GamePlay getGamePlay() {
		return gamePlay;
	}

	public void setGamePlay(GamePlay gamePlay) {
		this.gamePlay = gamePlay;
	}

	public GameState getNextState() {
		return nextState;
	}

	public void setNextState(GameState nextState) {
		this.nextState = nextState;
	}

	public GameContext(){
		
	}
	
	public GameContext(GameState currentState, GameState nextState){
		this.currentState = currentState;
		this.nextState = nextState;
		
	}

	public void changeState(GameState gameState){
		this.currentState = gameState;
		
	}
	public GameState getCurrentState() {
		return currentState;
	}
	public void setCurrentState(GameState currentState) {
		this.currentState = currentState;
	}
	

}
