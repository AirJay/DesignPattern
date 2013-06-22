package abstractfactory;

public class SeniorFactory extends Factory{

	@Override
	public Programer programerCreater() {
		return new SeniorProgramer();
	}

	@Override
	public PA paCreator() {
		return new SeniorPA();
	}

}
