package prototype;


import java.util.*;

public class SymbolLoader  {
    private Hashtable symbols = new Hashtable();
    public SymbolLoader() {
           symbols.put("Line", new LineSymbol());
           symbols.put("Note", new NoteSymbol());
    }
    public Hashtable getSymbols() {
        return symbols;
    }
}