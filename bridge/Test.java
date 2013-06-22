package bridge;


public class Test  {
    public Test() {
    }

    public static void main(String[] args) {
        Game myGame = new StarWarGame("Mobile");
        myGame.play();

        myGame =  new StarWarGame("Internet");
        myGame.play();

        System.out.println("------------------------------------------");
           
        myGame = new SuperManGame("Mobile");
        myGame.play();

        myGame =  new SuperManGame("Internet");
        myGame.play();
    }
}