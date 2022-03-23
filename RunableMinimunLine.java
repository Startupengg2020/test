package capgemini;

public class RunableMinimunLine {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            for (int i=0;i<=5;i++){
                System.out.println("Hi    "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException a){
                    a.printStackTrace();
                }
            }
        });


        Thread t2 = new Thread(() ->{
            for (int i=0;i<=5;i++){
                System.out.println("Hello   "+ Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException a){
                    a.printStackTrace();
                }
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());



        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Vaibhav");
    }
}
