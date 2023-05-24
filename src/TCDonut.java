public class TCDonut implements ItimsConsumable {
    String name = "Donut";
    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public double getPrice() {
        return 2.50;

    }

    public String toString() {
        return "Item Name : " + name + "\n" +
                "Calories : " + getCalories() + "\n" +
                "Price of Donut is : $" + getPrice();
    }
}