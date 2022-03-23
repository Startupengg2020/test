package capgemini;


public class MyFirstClass {
    private int side;
    private String color;
    static  int a;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static void add(){
        int c;
        c=10;
        System.out.println("Addition is ="+c);
    }

    public static void main(String[] args) {
        MyFirstClass b = new MyFirstClass();
        b.setSide(4);
        b.setColor("red");
        b.a=10;


        MyFirstClass b1 = new MyFirstClass();
        b1.setSide(10);
        b1.setColor("blue");
        b1.a=44;

        MyFirstClass b3 = new MyFirstClass();
        b3.setSide(56453);
        b3.setColor("Black");



        System.out.println("b.side="+b.getSide());
        System.out.println("b.color="+b.getColor());
        System.out.println("__________________");
        System.out.println("b1.side="+b1.getSide());
        System.out.println("b1.color="+b1.getColor());
        System.out.println("b3.side="+b3.getSide());
        System.out.println("b3.color="+b3.getColor());
        System.out.println(b1.a);
        System.out.println(b.a);





        b.add();
    }
}
