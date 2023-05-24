public class HockeyCards implements ItimMerchandise {
    String name = "Hockey Cards";
    @Override
    public String getFeature() {
        return "Tim's exclusive Hockey Cards are here to celebrate Hockey Session.";
    }

    @Override
    public double getPrice() {
        return 25.00;

    }
    public String toString(){
        return "Item Name : "  + name + "\n"  + "Features : " +  getFeature() + "\n" + "Price of this Hockey Card is: $"+ getPrice()  ;
    }

}
