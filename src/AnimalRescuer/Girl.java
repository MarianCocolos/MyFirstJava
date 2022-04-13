package AnimalRescuer;

public class Girl {

//    String name = "Alexandra";
//    int age = 30;
//    double amountofMoneyavailable = 300;

    private String name;
    private int age;
    private double amountofMoneyavailable;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getAmountofMoneyavailable(){
        return this.amountofMoneyavailable;
    }
    public void setAmountofMoneyavailable(double amountofMoneyavailable){
        this.amountofMoneyavailable = amountofMoneyavailable;
    }

    public void playing(){
        System.out.println("Play with the dog");
    }
    public void feed(){
        System.out.println("Feed the dog");
    }

}
