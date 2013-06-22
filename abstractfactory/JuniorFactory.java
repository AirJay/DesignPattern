package abstractfactory;

public class JuniorFactory extends Factory{

	@Override
	public Programer programerCreater() {
		return new JuiorProgramer();
	}

	@Override
	public PA paCreator() {
		return new JuniorPA();
	}

}
