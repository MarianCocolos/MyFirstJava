package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog constantin = new Dog();
        int x = 3;
        System.out.println(x);

        constantin.name = "TRex";
        constantin.race = "";
        System.out.println(constantin.name);
        constantin.run();

        Dog const2 = new Dog();
        System.out.println(const2.name);

        System.out.println("Varsta catelului este: "+ constantin.ageInMonths + " luni");
        System.out.println("Nivelul starii de sanatate: " + constantin.levelofHealth);
        constantin.sleep();

        Girl alexandra = new Girl();
        System.out.println("Varsta Alexandrei este: " + alexandra.age + " ani");
        System.out.println("Suma de bani disponibila: " + alexandra.amountofMoneyavailable + " euro");
        alexandra.feed();

        DogFood food = new DogFood();
        System.out.println("The name of the food is:" + food.nameoffood);
        System.out.println("Amount of food: " + food.amountoffood + " kg");
        System.out.println("Price of food is: " + food.price + " lei");

        Veterinarian vet = new Veterinarian();
        System.out.println("The name of veterinarian is: " + vet.name);
        System.out.println("Specialization: " + vet.specialization);
        vet.consultation();
    }
}
