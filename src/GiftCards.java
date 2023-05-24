public class GiftCards implements ItimMerchandise{
    String Item = "Gift Cards";
    @Override
    public String getFeature() {
        return "Celebrate your festival with Tim's Gift Card.";
    }

    @Override
    public double getPrice() {
        return 20.00;

    }
    public String toString(){
        return "Item Name : "  + Item + "\n"  + "Features : " +  getFeature() + "\n" + "Price of this Gift Card is: $"+ getPrice()  ;
    }
}
