import java.util.ArrayList;

public class Ships {
     String nameOfShip;
     String homePort;
     String originTransport;
     String destination;

    private static int statID;
    public int ID;
     double maxCapacity;
     double maxWeight;

    static ArrayList<Ships> ships = new ArrayList<>();
    static ArrayList<Object> containers = new ArrayList<>();

    public Ships() {
        statID+=1;
        ID=statID; // static, when u create new object it would +1
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    public String getOriginTransport() {
        return originTransport;
    }

    public void setOriginTransport(String originTransport) {
        this.originTransport = originTransport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return ID + " -- ID" + "\n Name: " + nameOfShip + "\n Transport Origin: " + originTransport
                + "\n Home Port: " + homePort + "\n Destination: " + destination;
    }
}