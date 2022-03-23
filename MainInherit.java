package capgemini;
import java.util.Scanner;
public class MainInherit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;

// for exhibition String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall
        do{
            System.out.println("Enter your choice");
            System.out.println("1. Exhibition");
            System.out.println("2. StageEvent");
            ch=sc.nextInt();
            switch(ch){
                case 1:Scanner dis=new Scanner(System.in);

                    String name,detail,type,organiser;
                    int noOfStalls;
                    double rentPerStall;
                    System.out.println("Enter the details ");
                    System.out.println("name,detail,type,organiser,noOfStalls,rentPerStall");
                    name=dis.nextLine();
                    detail=dis.nextLine();
                    type=dis.nextLine();
                    organiser=dis.nextLine();
                    noOfStalls=dis.nextInt();
                    rentPerStall=dis.nextDouble();
                    Exhibition obj1=new Exhibition(name,detail,type,organiser,noOfStalls,rentPerStall);
                    double result=obj1.calculateAmount();
                    System.out.println(result);
                    break;
                case 2: Scanner dis1=new Scanner(System.in);
                    String name1,detail1,type1,organiser1;
                    int noOfStalls1;
                    double rentPerStall1;
                    int noOfShows;
                    double costPerShow;
                    System.out.println("Enter the details ");
                    System.out.println("name,detail,type,organiser, noOfShow, costPerShow");
                    name1=dis1.nextLine();
                    detail1=dis1.nextLine();
                    type1=dis1.nextLine();
                    organiser1=dis1.nextLine();

                    noOfShows=dis1.nextInt();
                    costPerShow=dis1.nextDouble();
                    StageEvent obj=new StageEvent(name1,detail1,type1,organiser1,noOfShows,costPerShow);
                    double result1=obj.calculateAmount();
                    System.out.println(result1);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
//            if(ch!=1 || ch!=2 ) {
//                System.out.println("Invalid input");
//                break;
//            }
        }while(ch== 1 || ch==2);
    }
}
