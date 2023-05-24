public class TCBagel implements ItimsConsumable{
    String name = "Bagel";
    @Override
    public int getCalories() {
        return 250;
    }

    @Override
    public double getPrice() {
        return 3.50;

    }
    public String toString(){
        return "Item Name : " + name + "\n" +
                "Calories : " + getCalories() + "\n" +
                "Price of Bagel is : $" + getPrice();

    }
}
