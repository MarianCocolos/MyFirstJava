import java.util.jar.JarEntry;

public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

        printMyName();

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5, 4);
        System.out.println(result2);

        System.out.println(result - result2);

        double result3 = division(6, 4);
        System.out.println(result3);

        double result4 = multiplication(7, 7);
        System.out.println(result4);

        printMyJava();

        double result5 = restofdivision(9, 2);
        System.out.println(result5);

        double result6 = average(8, 5, 3);
        System.out.println("Media numerelor: " + result6);

        double result7 = meters(15);
        System.out.println("Metri: " + result7);

        double result8 = celsius(75);
        System.out.println("Grade celsius: " + result8);

        model();
    }

    public static void printMyName() {

        System.out.println("Hello\nMarian");

    }

    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    public static void printMyJava() {
        System.out.println("    J      a     v     v     a \n    J     a a     v   v     a a \nJ   J    aaaaa     v v     aaaaa \n J J    a     a     v     a     a");
    }

    public static double restofdivision(double firstNumber, double secondNumber) {
        double result = firstNumber % secondNumber;
        return result;
    }

    public static double average(double firstNumber, double secondNumber, double thirdNumber) {
        double result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;
    }

    public static double meters(double inchNumber) {
        double result = inchNumber / 39.370;
        return result;
    }

    public static double celsius(double fahrenheitNumber) {
        double result = (((fahrenheitNumber - 32) * 5) / 9);
        return result;
    }

    public static void model() {
        System.out.print("   +'''''+\n");
        System.out.print(" [ |0   0| ]\n");
        System.out.print("   |  ^  |\n");
        System.out.print("   | '_' | \n");
        System.out.print("   +_____+");
    }
}