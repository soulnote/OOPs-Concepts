package threads;

public class ProducerConsumer {
    public static void main(String[] args) {
        Company company = new Company();
        Producer p = new Producer(company);
        Consumer c = new Consumer(company);
        p.start();
        c.start();

    }
}


class Company {
    int n ;
    boolean isrunning = false;
    synchronized public void produce_item(int n) throws Exception{
        if(isrunning){
            wait();
        }
        this.n= n;
        System.out.println("Produced : " + this.n);
        isrunning = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if(isrunning==false){
            wait();
        }
        System.out.println("Consumed : "+ this.n);
        isrunning = false;
        notify();
        return this.n;
    }
}
class Producer extends Thread {
    Company pc;
    Producer(Company pc){
        this.pc = pc;
    }
    public void run(){
        int i=1;
        while (true) {
            // this.pc.produce_item(i);
            
            try {
                pc.produce_item(i);

                Thread.sleep(200);
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
            }
            i++;
        }
    }
    
}
class Consumer extends Thread {
    Company pc;
    Consumer(Company pc){
        this.pc = pc;
    }
    public void run(){
        while (true) {
           
            try {
                this.pc.consume_item();
                
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO Auto-generated catch block
            }
        }
    }
    
}
