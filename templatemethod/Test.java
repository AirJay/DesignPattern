package templatemethod;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GamePlay gp = new CashGame();
		gp.play();
		
		gp = new FPYGame();
		gp.play();

	}

}
