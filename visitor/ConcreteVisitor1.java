package visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor1 implements Visitor {

	public void visitCollection(Collection collection) {

		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable) {
				((Visitable) o).accept(this);
			}
		}
	}

	public void visitFloat(FloatElement floatE) {
		System.out.println(floatE.getFe() * 2);
	}

	public void visitString(StringElement stringE) {
		System.out.println("Name:" + stringE.getStr());
	}



}
