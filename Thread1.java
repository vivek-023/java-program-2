class A extends Thread{
        public void run(){
            System.out.println("Hello World");
        }
    }
public class Thread1 {
    public static void main(String[] args) {
        System.out.println("main start");
       A a1 = new A();
       System.out.println("main thread");
        a1.run();
    }
    
}
