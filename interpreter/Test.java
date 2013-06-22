package interpreter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Context ctx = new Context();
		ctx.setContent("123456");
		ctx.add(new SimpleExpression());
		ctx.add(new AdvancedExpression());
		

		for (AbstractExpression eps : ctx.getList()) {
			eps.interpret(ctx);
		}

	}

}
