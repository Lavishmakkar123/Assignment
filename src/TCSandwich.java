public class TCSandwich implements ItimsConsumable {
    String name = "Sandwich";
    @Override
    public int getCalories() {
        return 488;
    }

    @Override
    public double getPrice() {
        return 7.99;

    }

    public String toString() {
        return "Item Name : " + name + "\n" +
                "Calories : " + getCalories() + "\n" +
                "Price of Sandwich is : $" + getPrice();
    }
}