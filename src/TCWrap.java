public class TCWrap implements ItimsConsumable{
    String name = "Wrap";
    @Override
    public int getCalories() {
        return 390;
    }

    @Override
    public double getPrice() {
        return 6.99;

    }
    public String toString(){
        return "Item Name : " + name + "\n" +
                "Calories : " + getCalories() + "\n" +
                "Price of Wrap is : $" + getPrice();
    }
}
