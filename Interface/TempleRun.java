package Interface;

public class TempleRun implements GameMenu {

    

    @Override
    public void play() {
        System.out.println("Run for your Life...");
    }

    @Override
    public void pause() {
        System.out.println("I'll be Back");
    }

    @Override
    public void restart() {
       System.out.println("Start again...");
    }

    @Override
    public void quit() {
       System.out.println("i can't take this any more...");
    }
    
}
