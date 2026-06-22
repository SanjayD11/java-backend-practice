package day5;

public class GradeSwitch {

    public static void main(String[] args) {
        String value = "B"; 

        switch (value) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}