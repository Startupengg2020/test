package capgemini;

public class Constrcutor {
    public Constrcutor(){
        System.out.println("From constrctor");
    }
    public Constrcutor(int a){
        this();   // we call 1st constrctor
        System.out.println("The is 2nd one ="+a);
    }

    public static void main(String[] args) {
        //new Constrcutor();
        new Constrcutor(3);
    }
}
