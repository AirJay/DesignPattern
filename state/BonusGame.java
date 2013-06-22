package state;

public class BonusGame extends GamePlay{

	@Override
	public void play(GameContext gameContext) {
		gameContext.setCurrentState(gameContext.getNextState());
		
		System.out.println("This is a Bonus play!");
		
	}

}
