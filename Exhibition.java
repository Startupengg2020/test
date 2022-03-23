package capgemini;

public class Exhibition extends Event{
    private int noOfStalls;
    private double rentPerStall;

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public double getRentPerStall() {
        return rentPerStall;
    }

    public void setRentPerStall(double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall){
        super(name,detail,type,organiser);
        setNoOfStalls(noOfStalls);
        setRentPerStall(rentPerStall);
    }
    double calculateAmount(){
        return getNoOfStalls()*getRentPerStall();
    };
}
