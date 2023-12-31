import java.util.*;
class Thread2 extends Thread {
    int a,b;
    public void run(){
        System.out.print("Enter Two Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Sum of two numbers is:"+(a+b));
        sc.close();
    }
    public static void main(String[]args){
        Thread2 a = new Thread2();
       // a.run(); call a method by making Thread2 class's object
       a.start(); //start() is a method which is defined in Thread class so it gives the same result..!
    }
    
}
