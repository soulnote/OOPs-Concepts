package threads;

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program Started");

        for(int i=0;i<10;i++){
            System.out.println("value of i is "+ i );
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO Auto-generated catch block
               
            }
        }
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("the current running thread is -> "+ name);
        t.setName("MyWorld");
        System.out.println("I am changing the thread name now it is -> "+ t.getName());
        System.out.println("id of the thread is -> "+ t.threadId()); 

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
           
        }
        System.out.println("Program ended...");
    }
}
