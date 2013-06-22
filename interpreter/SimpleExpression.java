package interpreter;

public class SimpleExpression extends AbstractExpression {

	@Override
	void interpret(Context ctx) {
		String content = ctx.getContent();
		StringBuilder sb = new StringBuilder();
		for(char c: content.toCharArray()){
			sb.append((char)(c+48));
		}
		System.out.println("Result from simple Expression :" +sb.toString());

	}

}
