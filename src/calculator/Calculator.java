package calculator;

public class Calculator {
    public double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }
    public double restofdivision(double firstNumber, double secondNumber) {
        double result = firstNumber % secondNumber;
        return result;
    }
}
