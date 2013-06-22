package iterator;

import java.util.Iterator;

public class FilterIterator implements Iterator{
	
	private Filter filter;
	private Object currentObject = null;
	private Iterator it;
	
	public FilterIterator(Iterator it, Filter filter){
		this.it = it;
		this.filter = filter;
	}

	public boolean hasNext() {
		boolean hasNext = false;
		while (it.hasNext()){
			Object next = it.next();
			if (filter.doFilter(next)){
				currentObject = next;
				hasNext = true;
				break;
			}
		}
		return hasNext;
	}

	public Object next() {
		
		return currentObject;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
