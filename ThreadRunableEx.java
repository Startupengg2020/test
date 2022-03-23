package capgemini;

class Hey implements Runnable{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException a){
                a.printStackTrace();
            }
        }
    }
}

class Help implements Runnable{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException a){
                a.printStackTrace();
            }
        }
    }
}


public class ThreadRunableEx {
    public static void main(String[] args) {
        Runnable h = new Hi();
        Runnable he = new Hello();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(he);

        t1.start();
        t2.start();

    }
}
