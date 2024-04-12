public class practiceThreads extends Thread{
   
    public void run(){
        System.out.println("Thread is staring....");
        try {
            System.out.println("Thread is Sleeping for 2 seconds....");
            sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thrad is stopped successfully");
    }

    public static void main(String[] args) {
        practiceThreads thread = new practiceThreads();
        thread.start();
    }
    
}
