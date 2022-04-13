package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
//        Dog constantin = new Dog();
//        int x = 3;
//        System.out.println(x);
//        constantin.name = "TRex";
//        constantin.race = "";
//        System.out.println(constantin.name);
//        constantin.run();
//        Dog const2 = new Dog();
//        System.out.println(const2.name);

//        System.out.println("Varsta catelului este: "+ constantin.ageInMonths + " luni");
//        System.out.println("Nivelul starii de sanatate: " + constantin.levelofHealth);
//        constantin.sleep();

//        Girl alexandra = new Girl();
//        System.out.println("Varsta Alexandrei este: " + alexandra.age + " ani");
//        System.out.println("Suma de bani disponibila: " + alexandra.amountofMoneyavailable + " euro");
//        alexandra.feed();

//        DogFood food = new DogFood();
//        System.out.println("The name of the food is:" + food.nameoffood);
//        System.out.println("Amount of food: " + food.amountoffood + " kg");
//        System.out.println("Price of food is: " + food.price + " lei");

//        Veterinarian vet = new Veterinarian();
//        System.out.println("The name of veterinarian is: " + vet.name);
//        System.out.println("Specialization: " + vet.specialization);
//        vet.consultation();


        Dog dog = new Dog();
        dog.setName("Barky");
        dog.setColor("Blue");
        System.out.println(dog.getName());
        dog.setRace("Labrador");
        System.out.println(dog.getRace());
        dog.setWeigth(22.5);
        System.out.println(dog.getWeigth());

        DogFood food = new DogFood();
        food.setStockavailability(20);
        System.out.println(food.getStockavailability());
        food.setAmountoffood(15);
        System.out.println(food.getAmountoffood());
        food.setPrice(162.5);
        System.out.println(food.getPrice());
        food.setNameoffood("Pedigree");
        System.out.println(food.getNameoffood());

        Girl girl = new Girl();
        girl.setAmountofMoneyavailable(350);
        System.out.println(girl.getAmountofMoneyavailable());
        girl.setAge(30);
        System.out.println(girl.getAge());
        girl.setName("Alexandra");
        System.out.println(girl.getName());

        Veterinarian vet = new Veterinarian();
        vet.setSpecialization("Primary Veterinarian");
        System.out.println(vet.getSpecialization());
        vet.setName("Dr. Popescu");
        System.out.println(vet.getName());


    }
}
