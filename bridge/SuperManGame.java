package bridge;



public class SuperManGame extends Game {
    
    
    public SuperManGame(String type) {
    	gameChannel = getGameChannel(type);
    }
    public void play() {
        
        System.out.print("You are playing Super Man");
        gameChannel.play();
    }
}