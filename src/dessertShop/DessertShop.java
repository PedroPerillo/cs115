package dessertShop;

import java.util.Scanner;

public class DessertShop {
    public static void main(String[]args){

        Order order = new Order();

        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

        boolean done = false;
        while (!done) {
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sunday");

            System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1" -> {
                        orderItem = userPromptCandy();
                        order.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                    }
                    case "2" -> {
                        orderItem = userPromptCookie();
                        order.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                    }
                    case "3" -> {
                        orderItem = userPromptIceCream();
                        order.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                    }
                    case "4" -> {
                        orderItem = userPromptSundae();
                        order.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                    }
                    default -> System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                }//end of switch (choice)
            }//end of if (choice.equals(""))
        }//end of while (!done)
        System.out.println("\n");
/*
        order.add(new Candy("Candy Corn", 1.5,.25 ));
        order.add(new Candy("Gummy Bears", .25,.35 ));
        order.add(new Cookie("Chocolate Chip",6, 3.99));
        order.add(new IceCream("Pistachio",2, .79));
        order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));
        for (DessertItem item : order.getOrderList()) {
            String itemName = item.getName();
            System.out.println (itemName);
        }
*/
/* commented out for Dessert Shop part 5

        for (DessertItem item : order.getOrderList() ){
            String itemName = item.getName();
            double itemTax = item.calculateTax();
            double itemCost = item.calculateCost();
            System.out.printf("%-40s$%-8.2f[Tax: $%.2f]\n", itemName, itemCost, itemTax);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-40s$%-8.2f[Tax: $%.2f]\n","Order Subtotals:",order.orderCost(),order.orderTax());
        System.out.printf("%-40s$%-8.2f\n","Order Totals:", order.orderCost()+order.orderTax());
        System.out.printf("%-40s%-8d\n", "Total number of items in the order:", order.itemCount());
*/
        for (DessertItem item : order.getOrderList()) {
            System.out.println(item);
        }

    }
    // toString method

    // UI Methods
    private static DessertItem userPromptCandy(){
        DessertItem candy;
        Scanner sIn = new Scanner(System.in);

        System.out.print("Enter the type of candy: ");
        String type = sIn.nextLine();
        System.out.print("Enter the weight: ");
        double weight = Double.parseDouble(sIn.nextLine());
        System.out.print("Enter the price per pound: ");
        double price = Double.parseDouble(sIn.nextLine());
        candy = new Candy(type,weight,price);

        return candy;
    }
    private static DessertItem userPromptCookie(){
        DessertItem cookie;
        Scanner sIn = new Scanner(System.in);

        System.out.println("Enter the type of cookie: ");
        String type = sIn.nextLine();
        System.out.println("Enter the quantity purchased: ");
        int quantity = Integer.parseInt(sIn.nextLine());
        System.out.println("Enter the price per dozen: ");
        double price = Double.parseDouble(sIn.nextLine());

        cookie = new Cookie(type,quantity,price);

        return cookie;
    }
    private static DessertItem userPromptIceCream(){
        DessertItem iceCream;
        Scanner sIn = new Scanner(System.in);

        System.out.println("Enter the type of Ice Cream used: ");
        String type = sIn.nextLine();
        System.out.println("Enter the number of scoops: ");
        int quantity = Integer.parseInt(sIn.nextLine());
        System.out.println("Enter the price per scoop: ");
        double price = Double.parseDouble(sIn.nextLine());

        iceCream = new IceCream(type,quantity,price);
        return iceCream;
    }
    private static DessertItem userPromptSundae(){
        DessertItem sundae;
        Scanner sIn = new Scanner(System.in);

        System.out.println("Enter the type of Ice Cream: ");
        String type = sIn.nextLine();
        System.out.println("Enter the number of scoops: ");
        int quantity = Integer.parseInt(sIn.nextLine());
        System.out.println("Enter the price per scoop: ");
        double price = Double.parseDouble(sIn.nextLine());
        System.out.println("Enter the kind of topping used: ");
        String toppingName = sIn.nextLine();
        System.out.println("Enter the price for the topping: ");
        double toppingPrice = Double.parseDouble(sIn.nextLine());

        sundae = new Sundae(type,quantity,price,toppingName,toppingPrice);
        return sundae;
    }
}

