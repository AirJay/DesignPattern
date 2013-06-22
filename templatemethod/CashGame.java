package templatemethod;

public class CashGame extends GamePlay{

	
	@Override
	protected void getBalance() {
		System.out.println("Get Balance for Cash Game.");
		
	}

	@Override
	protected void calculateWin() {
		System.out.println("Calculate Win for Cash Game.");
		
	}

	@Override
	protected void generateResult() {
		System.out.println("Generate Result for Cash Game.");
		
	}


}
