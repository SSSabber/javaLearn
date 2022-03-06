package thread;

class MyThread implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(ticket>0){
            System.out.println(Thread.currentThread().getName()+":"+ticket--);
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
