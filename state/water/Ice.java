package state.water;

public class Ice implements Water {
	public void handleHeat(Context c) {
		c.setWater(new LiquidWater());
	}

	public void handleCold(Context c) {
		c.setWater(new Ice());
	}

	public void getUsage() {
		System.out.println("We can skate now");
	}

}
