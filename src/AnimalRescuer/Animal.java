package AnimalRescuer;

public class Animal extends LivingBeings{
    private String ownerName;

    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
}
