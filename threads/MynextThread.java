package threads;

public class MynextThread extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("value is "+ i + "in MynextThread :)");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
    }
    public static void main(String[] args) {
        MynextThread t1 = new MynextThread();
        //creating MyThread object here 
        MyThread t2 = new MyThread();
        Thread th = new Thread(t2);
        th.start();
        t1.start();
    }
    
}
