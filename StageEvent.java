package capgemini;

public class StageEvent extends Event {
    private int noOfShows;
    private double costPerShow;

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(double costPerShow) {
        this.costPerShow = costPerShow;
    }

    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow){
        super( name,  detail,type,organiser);
        setNoOfShows(noOfShows);
        setCostPerShow(costPerShow);
    }
    double calculateAmount(){
        return noOfShows*costPerShow;
    }
}
