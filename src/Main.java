import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItimsItems[] Items = new ItimsItems[100];
        int orderCounter = 0;


        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Welcome to TimHortons:\nPlease Choose option from the list below: \n" + printTimItems());
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(printMerchandise());
                    choice = sc.nextInt();


                    switch (choice) {

                        case 1:
                            Mugs Mug = new Mugs();
                            System.out.println(Mug.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Mug;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;

                        case 2:
                            CoffeePowder CoffeePowder = new CoffeePowder();
                            System.out.println(CoffeePowder.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");

                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = CoffeePowder;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 3:
                            GiftCards GiftCard = new GiftCards();
                            System.out.println(GiftCard.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = GiftCard;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 4:
                            HockeyCards HockeyCard = new HockeyCards();
                            System.out.println(HockeyCard.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");

                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = HockeyCard;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        default:
                            System.out.println("Invalid Input\nPlease try again :=)");
                            break;
                    }
                    break;


                case 2:
                    System.out.println(printConsumables());
                    choice = sc.nextInt();

                    switch (choice) {


                        case 1:
                            TCDonut Donut = new TCDonut();
                            System.out.println(Donut.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Donut;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 2:
                            TCBagel Bagel = new TCBagel();
                            System.out.println(Bagel.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Bagel;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 3:
                            TCCoffee Coffee = new TCCoffee();
                            System.out.println(Coffee.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Coffee;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 4:
                            TCWrap Wrap = new TCWrap();
                            System.out.println(Wrap.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Wrap;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        case 5:
                            TCSandwich Sandwich = new TCSandwich();
                            System.out.println(Sandwich.toString() + "\n" + "1. Order " + "\n" + "2. Continue with other items " + "\n" + "3. Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                Items[orderCounter++] = Sandwich;
                                System.out.println("Item added to the cart.");
                            } else if (choice == 3) {
                                System.out.println("Thankyou for choosing TimHortons");
                                return;
                            } else if (choice == 2) {
                                System.out.println("Other Consumable Products We Offer : ");
                            }
                            break;
                        default:
                            System.out.println("Invalid Input\nPlease try again :=)");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Thankyou for choosing TimHortons. ");
                    return;
                default:
                    System.out.println("Invalid Input\nPlease try again :=). ");
                    break;
            }
            for (int i = 0; i < Items.length; i++) {
                if (Items[i] instanceof ItimsItems) {
                    System.out.println("-----------------------\n" + "Total ordered Items placed = " + orderCounter + " .\n" + "-----------------------");
                }
                break;

            }

        } while (true);
    }


    public static String printTimItems() {
        return "1. Tim Merchandise.\n" + "2. Tim Consumables.\n" + "3. Don't Want to order anything.";
    }

    public static String printMerchandise() {
        return "1. Mugs.\n2. Coffee Powders.\n3. Gift Cards\n4. Hockey Cards";

    }

    public static String printConsumables() {
        return "1. Donut\n2. Bagel\n3. Coffee\n4. Wraps\n5. Sandwich ";


    }
}
