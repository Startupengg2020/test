package capgemini;
import java.util.Scanner;

public class Account {
    String name;
    String tranType;
    Long accNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public Long getAccNo() {
        return accNo;
    }

    public void setAccNo(Long accNo) {
        this.accNo = accNo;
    }

    public static void main(String[] args) {
        Account ob = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        ob.setName(sc.nextLine());
        System.out.println("Enter the account transction type :");
        ob.setTranType(sc.nextLine());
        System.out.println("Enter the account number :");
        ob.setAccNo(sc.nextLong());

        System.out.println("");
        System.out.println(ob.getName());
        System.out.println(ob.getTranType());
        System.out.println(ob.getAccNo());





    }
}
