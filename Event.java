package capgemini;

abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    Event(String name,String detail, String type,String organiser){
        setName(name);
        setDetail(detail);
        setType(type);
        setOrganiser(organiser);
    }
    abstract double calculateAmount();
}


