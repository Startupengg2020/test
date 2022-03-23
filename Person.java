package capgemini;

public class Person {
    private String name;
    private int age;
    static  String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
         Person ob1 = new Person();
         ob1.setName("Vaibhav");
         ob1.setAge(22);
        ob1.city="Aurangabad";



        Person ob2 = new Person();
        ob2.setName("Ayush");
        ob2.setAge(25);


        Person ob3 = new Person();
        ob3.setName("Rahul");
        ob3.setAge(20);


        Person ob4 = new Person();
        ob4.setName("Saurabh");
        ob4.setAge(28);



        Person ob5 = new Person();
        ob5.setName("Pratik");
        ob5.setAge(30);


        System.out.println("The name of person is : "+ ob1.getName()+"    Age is :     "+ ob1.getAge()+"    City is :   "+ob1.city);
        System.out.println("The name of person is : "+ ob2.getName()+"    Age is :     "+ ob2.getAge()+"    City is :   "+ob1.city);
        System.out.println("The name of person is : "+ ob3.getName()+"    Age is :     "+ ob3.getAge()+"    City is :   "+ob1.city);
        System.out.println("The name of person is : "+ ob4.getName()+"    Age is :     "+ ob4.getAge()+"    City is :   "+ob1.city);
        System.out.println("The name of person is : "+ ob5.getName()+"    Age is :     "+ ob5.getAge()+"    City is :   "+ob1.city);










    }
}
