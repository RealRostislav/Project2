import java.util.ArrayList;

public class Warehouse { // case 3 from main

    static ArrayList<HeavyContainer> heavyContainers = new ArrayList<>();
    static ArrayList<ToxicWithPowder> toxicWithPowders = new ArrayList<>();
    static ArrayList<ToxicContainer> toxicContainers = new ArrayList<>();
    static ArrayList<StandardContainer> standardContainers = new ArrayList<>();
    static ArrayList<ExplosiveContainer> explosiveContainers = new ArrayList<>();
    static ArrayList<RefrigeratedContainer> refrigeratedContainers = new ArrayList<>();
//from main
    do

    {
        System.out.println("1. Creating Ships");
        System.out.println("2. Creating Containers");
        System.out.println("3. Warehouse");
        System.out.println("0. Exit");
        System.out.print("Please choose any number from above: ");
        input = scan.nextInt();
        switch (input) {
            case 0 -> {
                return;
            }

            case 1 -> {
                Seaport.C(new Ship());
            }

            case 2 -> {
                containers.createContainer();
            }

            case 3 -> {
                System.out.println("1. Refrigerated");
                System.out.println("2. Explosive");
                System.out.println("3. Toxic Liquid");
                System.out.println("4. Toxic Powder");
                System.out.println("5. Heavy");
                System.out.println("6. Standard");
                System.out.print(": ");
                input = scan.nextInt();

                switch (input) {
                    case 1 -> {
                        for (Refrigerated refrigerated : Warehouse.refrigeratedContainers) {
                            System.out.println(refrigerated);
                        }
                    }

                    case 2 -> {
                        for (Explosive explosive : Warehouse.explosive) {
                            System.out.println(explosive);
                        }
                    }

                    case 3 -> {
                        for (ToxicLiquid toxicLiquid : Warehouse.toxicLiquid) {
                            System.out.println(toxicLiquid);
                        }
                    }

                    case 4 -> {
                        for (ToxicPowder toxicPowder : Warehouse.toxicPowder) {
                            System.out.println(toxicPowder);
                        }
                    }

                    case 5 -> {
                        for (HeavyContainer heavyContainer : Warehouse.heavy) {
                            System.out.println(heavyContainer);
                        }
                    }

                    case 6 -> {
                        for (Standard standard : Warehouse.standard) {
                            System.out.println(standard);
                        }
                    }
                }
            }
        }
    }
}