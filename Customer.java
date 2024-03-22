package Duke.choice;

public class Customer {

    private String name;
    private String Size;
    
    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
     private Clothing[] items;

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalClothingCost(){
        double total = 0.0;
         for (Clothing item : items) {
//            if (c1.getSize().equals(items.getSize())) {
                total += item.getPrice();
//                System.out.println(items.getDescription() + " price is " + items.getPrice() + " and size is " + items.getSize());
//                total += total *tax ;
//                if(total > 15){break;}
//            }
        }
        return  total;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3 ->
                setSize("S");
            case 4, 5, 6 ->
                setSize("M");
            case 7, 8, 9 ->
                setSize("L");
            default ->
                setSize("X");
        }
    }
}
