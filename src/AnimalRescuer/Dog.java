package AnimalRescuer;

public class Dog {
//    String color = "yellow";
//    double weigth = 20.3;
//    int ageInMonths = 10;
//    int levelofHealth = 9;
//    int moodlevel = 10;
//    String ownerName = "Mirabela";
//    String race = "Labrador";
//    String name = "Constantin";
//    boolean isMale = true;

    private String color;
    private double weigth;
    private int ageInMonths;
    private String ownerName;
    private String race;
    private String name;
    private boolean isMale;

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getWeigth(){
        return this.weigth;
    }
    public void setWeigth(double weigth){
        this.weigth = weigth;
    }
    public int getAgeInMonths(){
        return this.ageInMonths;
    }
    public void setAgeInMonths(int ageInMonths){
        this.ageInMonths = ageInMonths;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getRace(){
        return this.race;
    }
    public void setRace(String race){
        this.race = race;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean getIsMale(){
        return this.isMale;
    }
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void eat(){
        System.out.println("Eating dog food");
    }

    public void sleep(){
        System.out.println("zzzzZZZ");
    }

    public void run(){
        System.out.println("Running ");
    }

    public void play(){
        System.out.println("playing fetch");
    }
    public void swimming(){
        System.out.println("swimming");
    }

}
