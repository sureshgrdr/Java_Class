package Interface;
public class Main {
    
    public static void main(String[] args){

        TempleRun templeRun = new TempleRun();

        System.out.println("Game: Temple Run");

        templeRun.play();
        templeRun.pause();
        templeRun.restart();
        templeRun.quit();

        System.out.println("");

        Puzzle blocks = new Puzzle();

        System.out.println("Game: Blocks");

        blocks.play();
        blocks.pause();
        blocks.restart();
        blocks.quit();

    }
}
