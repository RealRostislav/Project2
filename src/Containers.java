import java.util.Scanner;

public class Containers {
    Scanner scanner = new Scanner(System.in);

    public void createContainer() {
        System.out.println("Choose type: ");
        System.out.println("1. Standard");
        System.out.println("2. Heavy Container");
        System.out.println("3. Explosive Container");
        System.out.println("4. Toxic Liquid");
        System.out.println("5. Toxic Powder");
        System.out.println("6. Refrigerated");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                StandardContainer standardContainer = new StandardContainer();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                standardContainer.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                standardContainer.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                standardContainer.setCertificateInformation(certificate);

                System.out.print("Brutto Weight: ");
                int gross = scanner.nextInt();
                standardContainer.setGrossWeight(gross);

                System.out.print("net Weight: ");
                int net = scanner.nextInt();
                standardContainer.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                standardContainer.setTareWeight(tare);
                StandardContainer.standardContainer.add(standardContainer);
                Warehouse.standardContainers.add(standardContainer);
                System.out.println("It has been created!");




            }

            case 2 -> {
                HeavyContainer heavyContainer = new HeavyContainer();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                heavyContainer.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                heavyContainer.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                heavyContainer.setCertificateInformation(certificate);

                System.out.print("Brutto Weight: ");
                int gross = scanner.nextInt();
                heavyContainer.setGrossWeight(gross);

                System.out.print("net Weight: ");
                int net = scanner.nextInt();
                heavyContainer.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                heavyContainer.setTareWeight(tare);
                HeavyContainer.heavyContainers.add(heavyContainer);
                Warehouse.heavyContainers.add(heavyContainer);
                System.out.println("It has been created!");



            }

            case 3 -> {
                ExplosiveContainer explosive = new ExplosiveContainer();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                explosive.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                explosive.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                explosive.setCertificateInformation(certificate);

                System.out.print("gross Weight: ");
                int gross = scanner.nextInt();
                explosive.setGrossWeight(gross);

                System.out.print("net Weight: ");
                int net = scanner.nextInt();
                explosive.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                explosive.setTareWeight(tare);
                ExplosiveContainer.explosiveContainers.add(explosive);
                Warehouse.explosiveContainers.add(explosive);
                System.out.println("It has been created!");
            }

            case 4 -> {
                ToxicContainer toxicLiquid = new ToxicContainer();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                toxicLiquid.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                toxicLiquid.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                toxicLiquid.setCertificateInformation(certificate);

                System.out.print("gross Weight: ");
                int gross = scanner.nextInt();
                toxicLiquid.setGrossWeight(gross);

                System.out.print("net Weight: ");
                int net = scanner.nextInt();
                toxicLiquid.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                toxicLiquid.setTareWeight(tare);
                ToxicContainer.toxicContainers.add(toxicLiquid);
                Warehouse.toxicContainers.add(toxicLiquid);
                System.out.println("It has been created!");


            }

            case 5 -> {

                ToxicWithPowder toxicPowder = new ToxicWithPowder();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                toxicPowder.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                toxicPowder.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                toxicPowder.setCertificateInformation(certificate);

                System.out.print("gross Weight: ");
                int gross = scanner.nextInt();
                toxicPowder.setGrossWeight(gross);

                System.out.print("net Weight: ");
                int net = scanner.nextInt();
                toxicPowder.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                toxicPowder.setTareWeight(tare);
                ToxicWithPowder.toxicWithPowders.add(toxicPowder);
                Warehouse.toxicWithPowders.add(toxicPowder);
                System.out.println("It has been created!");

            }

            case 6 -> {
                RefrigeratedContainer refrigerated = new RefrigeratedContainer();
                System.out.print("Sender info: ");
                String shipper = scanner.next();
                refrigerated.setShipperInformation(shipper);

                System.out.print("Secure info: ");
                String security = scanner.next();
                refrigerated.setSecurityInformation(security);

                System.out.print("Certificate: ");
                String certificate = scanner.next();
                refrigerated.setCertificateInformation(certificate);

                System.out.print("Gross Weight: ");
                int gross = scanner.nextInt();
                refrigerated.setGrossWeight(gross);

                System.out.print("Net Weight: ");
                int net = scanner.nextInt();
                refrigerated.setNetWeight(net);

                System.out.print("Tare: ");
                int tare = scanner.nextInt();
                refrigerated.setTareWeight(tare);
                RefrigeratedContainer.refrigeratedContainers.add(refrigerated);

                Warehouse.refrigeratedContainers.add(refrigerated);

                System.out.println("It has been created!");
            }

            default -> System.out.println("Something went wrong");
        }
    }
}