package templatemethod;

public abstract class GamePlay {

	public void play(){
		startSpin();
		getBalance();
		calculateWin();
		generateResult();
		stopSpin();
		
	}
	
	protected abstract void getBalance();
	protected abstract void calculateWin();
	protected abstract void generateResult();
	
	private void startSpin(){
		System.out.println("Start to spin the reels");
	}

	private void stopSpin(){
		System.out.println("Stop the reels");
	}

}

