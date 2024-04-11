package Thread;

public class Main {
    public static void main(String[] args) {
        

        //Instance
        Task task1 = new Task("Batman");
        Task task2 = new Task("Superman");

        task1.start();
        task2.start();
    }
}
