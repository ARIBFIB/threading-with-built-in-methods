public class RunnableinterfaceThread implements Runnable{
    public void run(){
        System.out.println("Thread is starting....");
    }
    public static void main(String[] args) {
        RunnableinterfaceThread object = new RunnableinterfaceThread();
        Thread object01 = new Thread(object);
        object01.start();
    }
}
