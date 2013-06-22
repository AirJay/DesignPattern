package visitor;

public class StringElement implements Visitable {

	 private String str;
	    
	    public StringElement(String str) {
	        this.str = str;
	    }
	    
	    public String getStr() {
	        return this.str;
	    }
	    
	    public void accept(Visitor visitor) {
	        visitor.visitString(this);
	    }


}
