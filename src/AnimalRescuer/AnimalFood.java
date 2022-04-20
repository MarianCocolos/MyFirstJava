package AnimalRescuer;

public class AnimalFood {
    private String nameoffood;
    private double price;
    private int amountoffood;
    private int stockavailability;
    private String foodquality;

    public String getFoodquality() {
        return foodquality;
    }

    public void setFoodquality(String foodquality) {
        this.foodquality = foodquality;
    }

    public String getNameoffood(){
        return this.nameoffood;
    }
    public void setNameoffood(String nameoffood){
        this.nameoffood = nameoffood;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getAmountoffood(){
        return this.amountoffood;
    }
    public void setAmountoffood(int amountoffood){
        this.amountoffood = amountoffood;
    }
    public int getStockavailability(){
        return this.stockavailability;
    }
    public void setStockavailability(int stockavailability){
        this.stockavailability = stockavailability;
    }
}
