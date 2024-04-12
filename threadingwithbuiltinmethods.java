/**
 * threadingwithbuiltinmethods
 */
// Some simple examples of threading with built-in methods: 
public class threadingwithbuiltinmethods {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread01 = new Thread();
        Thread thread02 = new Thread();
        Thread thread03 = new Thread();
        Thread thread04 = new Thread();




        System.out.println("The default Name: " + thread.getName());
        System.out.println("The default Name01: " + thread01.getName());
        System.out.println("The default Name02: " + thread02.getName());
        System.out.println("The default Name03: " + thread03.getName());
        System.out.println("The default Name04: " + thread04.getName());


        thread.setName("Abdul Rehman Irfan");
        System.out.println("Updated Name: " + thread.getName());

        thread01.setName("Haider Ali");
        System.out.println("Updated Name01: " + thread01.getName());

        thread02.setName("Abdul Wahab");
        System.out.println("Updated Name02: " + thread02.getName());

        thread03.setName("Abdul Hanan");
        System.out.println("Updated Name03: " + thread03.getName());

        thread04.setName("Faizan Irfan");
        System.out.println("Updated Name04: " + thread04.getName());


    }
}


















// public class NamingThreadExample {
//     public static void main(String[] args) {
//         Thread thread = new Thread();
//         System.out.println("Default Thread Name: " + thread.getName()); // Output: Default Thread Name: Thread-0
        
//         thread.setName("MyThread");
//         System.out.println("Updated Thread Name: " + thread.getName()); // Output: Updated Thread Name: MyThread
//     }
// }

// public class NamingThreadInConstructorExample {
//     public static void main(String[] args) {
//         Thread thread = new Thread("MyThread");
//         System.out.println("Thread Name: " + thread.getName()); // Output: Thread Name: MyThread
//     }
// }





// public class threadingwithbuiltinmethods extends Thread{
//     public void run(){
//         System.out.println("Thread is starting.....");
//     }

//     public static void main(String[] args) {
//         name01 = new threadingwithbuiltinmethods();
//         threadingwithbuiltinmethods name02 = new threadingwithbuiltinmethods();

//         System.out.println("First name01" + name01.getName());
//         System.out.println("Second name02 " + name02.getName());

//         name01.start();
//         name02.start();

//         name01.setName("Abdul");
//         System.out.println("Name of name01" + name01.getName());
//     }
    
// }