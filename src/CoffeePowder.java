public class CoffeePowder implements ItimMerchandise{
    String Item = "Coffee Powder";
    @Override
    public String getFeature() {
        return "Made with fresh coffee beans.";
    }

    @Override
    public double getPrice() {
        return 7.99;

    }
    public String toString(){
        return "Item Name : "  + Item + "\n"  + "Features : " +  getFeature() + "\n" + "Price of this Coffee Powder is: $"+ getPrice();
    }
}
