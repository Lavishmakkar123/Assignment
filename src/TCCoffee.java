public class TCCoffee implements ItimsConsumable{
    String name = "Coffee";

    @Override
    public int getCalories() {
        return 150;
    }

    @Override
    public double getPrice() {
        return 1.92;

    }
    public String toString(){
        return "Item Name : " + name + "\n" +
                "Calories : " + getCalories() + "\n" +
                "Price of Coffee is : $" + getPrice();
    }
}
