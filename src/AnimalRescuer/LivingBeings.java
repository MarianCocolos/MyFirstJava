package AnimalRescuer;

public class LivingBeings {
    private String name;
    private int age;
    private int ageInMonths;
    private String race;
    private String color;
    private double weigth;
    private String height;
    private boolean isMale;

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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public int getAgeInMonths(){
        return this.ageInMonths;
    }
    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
