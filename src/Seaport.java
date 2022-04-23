import java.util.Scanner;

public class Seaport { // изменить стиль
    Scanner scanner = new Scanner(System.in);

    public void creatingShips(Ships object) {
        System.out.print("Name of the ship: ");
        String ship_name = scanner.next();
        object.setNameOfShip(ship_name);

        System.out.print("Home port: ");
        String homePort = scanner.next();
        object.setHomePort(homePort);

        System.out.print("Transport origin: "); // izm
        String OriginTransport = scanner.next();
        object.setOriginTransport(OriginTransport);

        System.out.print("Destination: ");
        String destination = scanner.next();
        object.setDestination(destination);

        System.out.print("Max capacity: ");
        int maxCapacity = scanner.nextInt();
        object.setMaxCapacity(maxCapacity);

        System.out.print("Max weight: ");
        int maxWeight = scanner.nextInt();
        object.setMaxWeight(maxWeight);

        System.out.println("Here is containers: ");
        System.out.println("1. Standard");
        System.out.println("2. Heavy Container");
        System.out.println("3. Explosive Container");
        System.out.println("4. Toxic Liquid");
        System.out.println("5. Toxic Powder");
        System.out.println("6. Refrigerated");
        int containers = scanner.nextInt();
        boolean ConLoop = true;
        while (ConLoop) {
            switch (containers) {
                case 1 -> {
                    Ships.containers.add(Warehouse.standardContainers);
                    System.out.println("Added!");
                    Warehouse.standardContainers.clear();
                    ConLoop = false;
                }

                case 2 -> {
                    Ships.containers.add(Warehouse.heavyContainers);
                    System.out.println("Added!");
                    Warehouse.heavyContainers.clear();
                    ConLoop = false;

                }

                case 3 -> {
                    Ships.containers.add(Warehouse.explosiveContainers);
                    System.out.println("Added!");
                    Warehouse.explosiveContainers.clear();
                    ConLoop = false;
                }

                case 4 -> {
                    Ships.containers.add(Warehouse.toxicContainers);
                    System.out.println("Added!");
                    Warehouse.toxicContainers.clear();
                    ConLoop = false;

                }

                case 5 -> {
                    Ships.containers.add(Warehouse.toxicWithPowders);
                    System.out.println("Added!");
                    Warehouse.toxicWithPowders.clear();
                    ConLoop = false;
                }

                case 6 -> {
                    Ships.containers.add(Warehouse.refrigeratedContainers);
                    System.out.println("Added!");
                    Warehouse.refrigeratedContainers.clear();
                    ConLoop = false;
                }

                default -> System.out.println("ERROR!");
            }
        }

        Ships.ships.add(object);
        System.out.println("<<<New object was created>>>");
    }
}