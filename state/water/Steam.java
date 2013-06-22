package state.water;

public class Steam implements Water {
	public void handleHeat(Context c) {
		c.setWater(new Steam());
	}

	public void handleCold(Context c) {
		c.setWater(new LiquidWater());
	}

	public void getUsage() {
		System.out.println("It can warm bread now");
	}

}
