package visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {

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
		System.out.println(floatE.getFe());
	}

	public void visitString(StringElement stringE) {
		System.out.println(stringE.getStr());
	}



}
