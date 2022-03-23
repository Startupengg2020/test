package capgemini;

interface Do{
    void m1();
    void m2();
    default void m3(){
        System.out.println("From M3");
    }
    static void m4(){
        System.out.println("From M4");
    }
}


public class InterFace implements Do{
    public void m1(){
        System.out.println("from M1");
    }
    public void m2(){
        System.out.println("from m2");
    }

    public static void main(String[] args) {
        Do d = new InterFace();
        d.m1();
        d.m2();
        d.m3();
        Do.m4();       // We cannot call static method with the help of object , we can call with the help of "interface" name.
    }
}
