package AnimalRescuer;

public class Veterinarian {
//    String name = "Dr. Popescu";
//    String specialization = "Primary Veterinarian";

    private String name;
    private String specialization;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public void consultation(){
        System.out.println("Consult the dog");
    }
    public void medication(){
        System.out.println("Administer the dog's medication");
    }
}
