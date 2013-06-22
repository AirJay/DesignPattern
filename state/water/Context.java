package state.water;

public class Context {
	private Water water = null;
	 public Water getWater() {
	  return water;
	 }
	 public void setWater(Water water) {
	  this.water = water;
	 }
	 public void HeatUp() {
	  water.handleHeat(this);
	  water.getUsage();
	 }
	 public void Cold() {
	  water.handleCold(this);
	  water.getUsage();
	 }


}
