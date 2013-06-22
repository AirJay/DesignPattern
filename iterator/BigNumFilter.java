package iterator;

public class BigNumFilter implements Filter{

	public boolean doFilter(Object obj) {
		if (! (obj instanceof Integer))
				return false;
		Integer num = (Integer)obj;
		if (num.compareTo(10) > -1)
			return true;
		else
			return false;
	}

}
