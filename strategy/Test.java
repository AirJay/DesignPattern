package strategy;


public class Test  {
    public static void main(String[] args) {
        int lineCount = 4;
        int lineWidth = 20;
        
        Context myContext = new Context();
        StrategyA strategyA = new StrategyA();
        StrategyB strategyB = new StrategyB();
        String s = "Long, long ago there lived a king. He loved horses. One day  he asked an artist to draw him a beautiful horse. The artist  said, \"All right, but you must wait.\" So the king waited. He  waited and waited. At last, after a year he could not wait any  longer. He went to see the artist himself.";
        myContext.setText(s);
        myContext.setLineWidth(lineWidth);
        myContext.setStrategy(strategyA);
        myContext.drawText();

        myContext.setLineCount(lineCount);
        myContext.setStrategy(strategyB);
        myContext.drawText();
    }
}