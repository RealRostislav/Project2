import java.util.ArrayList;
public class ExplosiveContainer {
    String shipperInformation;
    String SecurityInformation;
    private static int statID;
    public int ID;
    String CertificateInformation;

    int grossWeight; // with package brutto
    int tareWeight;
    int netWeight; //without package

    static ArrayList<ExplosiveContainer> explosiveContainers = new ArrayList<>();

    public String getShipperInformation() {
        return shipperInformation;
    }

    public void setShipperInformation(String shipperInformation) {
        this.shipperInformation = shipperInformation;
    }

    public String getSecurityInformation() {
        return SecurityInformation;
    }

    public void setSecurityInformation(String securityInformation) {
        this.SecurityInformation = securityInformation;
    }

    public String getCertificateInformation() {
        return CertificateInformation;
    }

    public void setCertificateInformation(String certificateInformation) {
        this.CertificateInformation = certificateInformation;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(int grossWeight) {
        this.grossWeight = grossWeight;
    }

    public int getTareWeight() {
        return tareWeight;
    }

    public void setTareWeight(int tareWeight) {
        this.tareWeight = tareWeight;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }
    public ExplosiveContainer() {
        statID+=1;
        ID = statID;
    }

    @Override
    public String toString() {
        return ID + " - ID's " + "Shipper:  " + shipperInformation + "\n Tare: " + tareWeight +
                "\n Security of Container: " + SecurityInformation +
                "\n Net Weight: " + netWeight + "Gross Weight: " + grossWeight + "\n Certificate Info:  " + CertificateInformation;
    }
}
