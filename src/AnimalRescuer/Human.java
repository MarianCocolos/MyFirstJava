package AnimalRescuer;

public class Human extends LivingBeings{

    private String religion;
    private double amountofMoneyavailable;
    private String specialization;


    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public double getAmountofMoneyavailable(){
        return this.amountofMoneyavailable;
    }
    public void setAmountofMoneyavailable(double amountofMoneyavailable){
        this.amountofMoneyavailable = amountofMoneyavailable;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}
