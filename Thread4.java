class Thread4 extends Thread{
    public void run(){
        try{
            for(int i=0; i<10; i++){
                System.out.println("Hello world");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        t1.start();
    }
    
}
