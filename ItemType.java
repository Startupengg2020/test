package capgemini;

import java.util.Scanner;

public class ItemType {
    private String  name;
    private double costPerDay;
    private double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void display(){
        System.out.println("Name :"+getName());
        System.out.println("CostPerDay :"+getCostPerDay());
        System.out.println("Deposit :"+getDeposit());


    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the item name :");
        String name=sc.next();

        System.out.println("Enter the cost per day:");
        double cost = sc.nextDouble();

        System.out.println("Enter the deposite:");
        double deposit = sc.nextDouble();


        ItemType obj = new ItemType();
        obj.setName(name);
        obj.setCostPerDay(cost);
        obj.setDeposit(deposit);
        obj.display();


    }
}
