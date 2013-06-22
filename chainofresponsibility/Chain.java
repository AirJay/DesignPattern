package chainofresponsibility;

/**
 *  The abstract class of the chain
 *  You can use AddChain function to modify the chain dynamically
 */
public abstract class Chain  {
    public abstract void addChain(Chain c);
    public abstract void sendToChain(ResponsibilityStatus resp);
    public abstract Chain getChain();
    protected ResponsibilityStatus responsibility = ResponsibilityStatus.OTHERS;
}