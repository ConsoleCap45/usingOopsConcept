/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duke.choice;

/**
 *
 * @author vigne
 */
public class Clothing {
    private String description;
    private double Price;
    private String Size="S";

    public Clothing(String description, double Price, String Size) {
        this.description = description;
        this.Price = Price;
        this.Size = Size;
    }
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX = .2;
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return Price + (Price*TAX);
    }

    public void setPrice(double Price) {
        this.Price = (Price > MIN_PRICE)? Price : MIN_PRICE;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
    
    
}
