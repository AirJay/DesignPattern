package bridge;


public abstract class Game  {
    public abstract void play();
    
    protected IGame gameChannel;
    
    protected IGame getGameChannel(String type) {
    	
        if(type.equals("Internet")) {
            return new GameInternet();
        } else if(type.equals("Mobile")) {
            return new GameMobile();
        } else {
            return new GameInternet();
        }
    }
}