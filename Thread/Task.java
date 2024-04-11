package Thread;

public class Task extends Thread {

    private String taskName;

    public Task(String taskName){
        this.taskName=taskName;
    }
    
    public void run(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("I'am " + taskName);

        }
    }
}
