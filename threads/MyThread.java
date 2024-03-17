package threads;
//creating thread using Runnable interface
public class MyThread implements Runnable{
    public void run(){
        //task for thread;
        for(int i=0;i<100;i++){
            System.out.println("value of i is "+i+ "in MyThread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();
    }
    
}
