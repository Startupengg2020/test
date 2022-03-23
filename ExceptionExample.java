package capgemini;

public class ExceptionExample
{
    void Method1(int a, int b){
        try{
        int c = a/b;
            System.out.println(c);

    }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println(" Finally block always excute :");
        }

        System.out.println("From Method 1 ");

    }

    public static void main(String[] args) {
        ExceptionExample ob = new ExceptionExample();
        ob.Method1(7,0);
        System.out.println("From main ");
    }

}

