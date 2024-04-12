public class BSE213051Assing03PT01 extends Thread{
    public void run(){
        System.out.println("\n"+"Thread is starting....");
        try {
            System.out.println("\n"+"Thread is sleep for 20 seconds.....");
            sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n"+"Thread Sleep not perform");
        }
        System.out.println("\n"+"Thread is Stopped.....");
    }
    public static void main(String[] args) {
        BSE213051Assing03PT01 thread = new BSE213051Assing03PT01();
        thread.start(); //for starting the thread

        LoadingAnimation animation = new LoadingAnimation();
        animation.animation_Loading();
    }
}
class LoadingAnimation {
    public void animation_Loading() {
        System.out.println("Loading");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}





























// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread starting...");
//         try {
//             Thread.sleep(2000); // Sleep for 2 seconds
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Thread stopping...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MyThread thread = new MyThread();
//         thread.start(); // Start the thread
//     }
// }




// public class DeadlockExample {
//     private static Object lock1 = new Object();
//     private static Object lock2 = new Object();

//     public static void main(String[] args) {
//         Thread thread1 = new Thread(() -> {
//             synchronized (lock1) {
//                 System.out.println("Thread 1 acquired lock1");
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 synchronized (lock2) {
//                     System.out.println("Thread 1 acquired lock2");
//                 }
//             }
//         });

//         Thread thread2 = new Thread(() -> {
//             synchronized (lock2) {
//                 System.out.println("Thread 2 acquired lock2");
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 synchronized (lock1) {
//                     System.out.println("Thread 2 acquired lock1");
//                 }
//             }
//         });

//         thread1.start();
//         thread2.start();
//     }
// }