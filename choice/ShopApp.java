/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Duke.choice;

/**
 *
 * @author vigne
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to DUKE CHOICE SHOP");
        Customer c1 = new Customer("pinky", 18);
        System.out.println("Minimum price of their product: " + Clothing.MIN_PRICE);
        System.out.println();
//        c1.setName("pinky");
//        c1.setSize("S");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.9, "X");

//          double total = tax + a + 2*b;
//          System.out.println(item1.description + " price is " +item1.Price + " and size is "+item1.Size);
//          System.out.println(item2.description + " price is " +item2.Price + " and size is "+item2.Size);
//        System.out.println(total);
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.9);
//        item2.setSize("S");
//
//        items[2].setDescription("Green Scarf");
//        items[2].setPrice(5.0);
//        items[2].setSize("S");
//
//        items[3].setDescription("Blue T-Shirt");
//        items[3].setPrice(10.5);
//        items[3].setSize("S");
//        int measurement = 10;
//
//        c1.setSize(measurement);
        c1.addItems(items);

//        System.out.println("Customer is " + c1.getName() + "," + c1.getSize());
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
            System.out.println("Items: " + item.getDescription());
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            count++;
            average += item.getPrice();
        }
        try {
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (Exception e) {
            System.out.println("It's an error in average, which is divided by zero");
        }
    }

}
