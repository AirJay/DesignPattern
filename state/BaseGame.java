package state;

public class BaseGame extends GamePlay{

	@Override
	public void play(GameContext gameContext) {
		gameContext.setCurrentState(gameContext.getNextState());
		System.out.println("This is a base play!");
		
	}


}
