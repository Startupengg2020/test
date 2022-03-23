package capgemini;

class Hi extends Thread{
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
class Hello extends  Thread{
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
public class ThreadEx {
    public static void main(String[] args) {
        Hi h = new Hi();
        Hello he = new Hello();



        h.start();
        he.start();
    }
}
