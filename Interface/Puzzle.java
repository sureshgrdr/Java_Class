package Interface;

public class Puzzle implements GameMenu {

    @Override
    public void play() {
        System.out.println("Solve the Puzzle");
    }

    @Override
    public void pause() {
        System.out.println("Game Paused..!");
    }

    @Override
    public void restart() {
       System.out.println("Restart Puzzle..?");
    }

    @Override
    public void quit() {
       System.out.println("Quit Game..?");
    }
    
}
