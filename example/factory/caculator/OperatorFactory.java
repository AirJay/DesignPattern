package example.factory.caculator;


public class OperatorFactory {

	public static Operator createOperator(char operation) {
		Operator op = null;

		switch (operation) {
		case '+':
			op = new OperatorAdd();
			break;
		case '-':
			op = new OperatorSub();
			break;
		default:
			break;
		}

		return op;
	}

}
