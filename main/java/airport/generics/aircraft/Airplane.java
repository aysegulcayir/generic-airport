package airport.generics.aircraft;

public abstract class Airplane {

    private String planeIdentification;
    private Boolean isCleaned;

    public Airplane() {
    }

    public Airplane(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    abstract void load(int load);
    abstract void disCharge( int load);

    public void takeOff() {
        System.out.println("Airplane taking off");
    }

    public void land() {
        System.out.println("Airplane landing");
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void clean(){
        isCleaned= true;
        System.out.println(planeIdentification+" is cleaned "+ this);
    }



}


