package capgemini;

import java.util.Scanner;

public class Function {
    private Float Percet;

    public Float getPercet() {
        return Percet;
    }

    public void setPercet(Float percet) {
        Percet = percet;
    }




    public void Fun1(){
        System.out.println("The is print :");
    }
    public void Fun2(String name){
        System.out.println(""+name);

    }
    public void Fun3(int age){
        System.out.println("The age ia ="+age);
    }
    public void Fun4(String name , int age){
        System.out.println("The name is :"+name+""+"The age is :"+age);
    }
    public String Fun5(String a, String b){
        String result=a+"  "+b;
        return result;
    }
    public  Float Fun6(Float a, Float b, Float c){
        Float sum = a+b+c;
        return sum;
    }



    public static void main(String[] args) {
        Function ob = new Function();
        ob.Fun1();
        ob.Fun2("vaibhav");

        System.out.println("Enter the age :");
        Scanner sc = new Scanner(System.in);
        //Fun 3
        ob.Fun3(sc.nextInt());

        //Fun4
        String a = sc.nextLine();
        int b =sc.nextInt();
        ob.Fun4(a,b);

        //Fun5
        System.out.println("Enter the Argument in Function (String , String)");
       System.out.println(ob.Fun5("Avinash","Bhone"));

       //Fun 6
       System.out.println("The sum is :"+ob.Fun6(1.2F,85.7F,5.4F));

        // Setter and getter


        ob.setPercet(1.5F);
        System.out.println("The percentage is :"+ob.getPercet());



    }
}
