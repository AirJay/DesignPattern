package bridge;



public class StarWarGame extends Game {
    
    
    public StarWarGame(String type) {
    	gameChannel = getGameChannel(type);
    }
    public void play() {
        
        System.out.print("You are playing Star War");
        gameChannel.play();
    }
}