package interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {

    private String content;
    
    private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void add(AbstractExpression eps) {
        list.add(eps);
    }
    
    public List<AbstractExpression> getList() {
        return list;
    }
}

