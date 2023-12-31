class Thread3 extends Thread {
    public void run(){
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
    }    
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        t1.start();
        Thread t2 = Thread.currentThread();
        System.out.println(t2);
    }
}
