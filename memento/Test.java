package memento;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator org = new Originator();
		org.setState("Release 3.6");

		Caretaker ctk = new Caretaker();
		ctk.setMemento(org.createMemento());

		org.setState("Release 3.7");
		org.showState();

		org.setMemento(ctk.getMemento());
		org.showState();

	}

}
