package visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();
		StringElement se = new StringElement("abc");
		se.accept(visitor);

		FloatElement fe = new FloatElement(new Float(1.5));
		fe.accept(visitor);
		System.out.println("===========");
		List result = new ArrayList();
		result.add(new StringElement("IGT"));
		result.add(new StringElement("Hexiong"));
		result.add(new StringElement("Interactive"));
		result.add(new FloatElement(new Float(1.5)));
		result.add(new FloatElement(new Float(5.0)));
		result.add(new FloatElement(new Float(0.2)));
		visitor.visitCollection(result);

	}

}
