public class Mugs implements ItimMerchandise{
    String name = "Mug";

    @Override
    public String getFeature() {
        return "Beautiful Red Mug made with premium material.";
    }

    @Override
    public double getPrice() {
        return 5.50;

    }
    public Mugs(){

    }


    public String toString(){
        return "Item Name : "  + name + "\n"  + "Features : " +  getFeature() + "\n" + "Price of this Mug is: $"+ getPrice()  ;
    }

}
