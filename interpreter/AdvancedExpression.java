package interpreter;


public class AdvancedExpression extends AbstractExpression {

	@Override
	void interpret(Context ctx) {
		String content = ctx.getContent();

		System.out.println("Result from Advanced Expression :"
				+ content.hashCode()*2+9);

	}

}
