package state.water;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Water water = new Ice();
		Context c = new Context();
		c.setWater(water);
		c.HeatUp();
		c.HeatUp();
		c.Cold();
		c.Cold();
		c.HeatUp();

	}

}
