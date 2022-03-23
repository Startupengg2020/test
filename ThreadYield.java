package capgemini;

public class ThreadYield extends Thread{
    public void run(){

        for (int i=0 ;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }

    public static void main(String[] args) {
        ThreadYield ty = new ThreadYield();
        ty.start();


        for (int i=0;i<=5;i++){
            Thread.yield();
            System.out.println("main threa  " + i);
        }
    }
}
