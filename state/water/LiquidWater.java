package state.water;

public class LiquidWater implements Water {
	public void handleHeat(Context c) {
		c.setWater(new Steam());
	}

	public void handleCold(Context c) {
		c.setWater(new Ice());
	}

	public void getUsage() {
		System.out.println("It can be drink");
	}

}
