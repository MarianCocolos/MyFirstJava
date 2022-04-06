package calculator;

public class LogicalOperations {

    public  int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public  String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public  String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

    public String snowAmount(int snow){
        if (snow >8 || snow == 6) {
            return "The amount of snow this winter was: " + snow + "cm";
        }
        else{
            return "The forecast snow is: " + snow + "cm";
        }
    }

    public String comparison(double number){
        if (number >3 && number!=4){
            return "The number is greater than 3 and not equal to 4";
        }else if (number ==4) {
            return "The number is equal to 4";
        }else if (number <3) {
            return "The number is lower than 3";
            }
        else {
            return "";
        }
    }

}
