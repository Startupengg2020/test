package capgemini;


class Table{
    void printTable(int n){       //synchronized method
        System.out.println("this is out of synchr"+Thread.currentThread());
        System.out.println("this is out of synchr"+Thread.currentThread());
        synchronized(this){
            for(int i=1;i<=5;i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("this is out of synchr");
        }

    }
}
public class TestSynchronzation {
    public static void main(String[] args) {
        final Table obj = new Table();//only one object

        Thread t1=new Thread(() ->  obj.printTable(5));

        Thread t2=new Thread(() ->  obj.printTable(100));
        t1.start();
        t2.start();

    }
}
