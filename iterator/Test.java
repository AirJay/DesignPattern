package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(15);
		list.add(20);
		list.add(26);
		list.add(3);
		
		Iterator it = list.iterator();
		Filter ft = new BigNumFilter();
		
		FilterIterator fit = new FilterIterator(it, ft);
		
		while(fit.hasNext()){
			Integer num = (Integer)fit.next();
			System.out.println(num);
		}

	}

}
