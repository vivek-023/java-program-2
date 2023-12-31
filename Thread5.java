public class Thread5 extends Thread {
    Thread5(String name){
        Thread t1 = new Thread(name);
        System.out.println(t1);
    }
    public void run(){
        try{
            for(int i=0; i<10; i++){
                System.out.println("Hello"+i);
                Thread.sleep(300);
            }
        }
        catch(Exception e){}
    }
    public static void main(String[] args) {
        Thread5 t1 = new Thread5("Vivek");
        t1.start();
        //System.out.println(t1);
        try{
            for(int i=0; i<10; i++){
                System.out.println("Hello"+i);
                //t1.start();
                Thread.sleep(300);
            }
        }
        catch(Exception e){}
    }
    
}
