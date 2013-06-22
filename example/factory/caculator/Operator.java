package example.factory.caculator;

public abstract class Operator {
	
	protected int numberA = 0;
	protected int numberB = 0;
	
	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
	
	public abstract int result();
	

}
