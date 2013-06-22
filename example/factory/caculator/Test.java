package example.factory.caculator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String expression = "15+16-7+0-2+99";
		Operator op = OperatorFactory.createOperator('+');
		String left = "0";
		String right = "";
		int result = 0;

		StringBuilder sb = new StringBuilder("0");

		for (char c : expression.toCharArray()) {

			if (Character.isDigit(c)) {
				sb.append(c);
			} else {
				right = sb.toString();
				sb.delete(1, sb.length());
				op.setNumberA(getInt(left));
				op.setNumberB(getInt(right));
				result = op.result();
				left = "" + result;

				op = OperatorFactory.createOperator(c);

			}
			
			if (sb.length() > 1){
				right = sb.toString();
				op.setNumberA(getInt(left));
				op.setNumberB(getInt(right));
				result = op.result();
			}
		}
		
		System.out.println(result);

	}

	public static int getInt(String input) {

		int output = 0;
		try {
			output = Integer.parseInt(input);

		} catch (Exception e) {
			//
		}

		return output;
	}

}
