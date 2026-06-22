package day25.regex;
import java.util.Scanner;

public class PasswordRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}

//Using Pattern & Matcher :

//import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//
//public class PasswordValidatorPM {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter password: ");
//        String password = sc.nextLine();
//
//        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
//
//        // Compile the pattern
//        Pattern pattern = Pattern.compile(regex);
//
//        // Create matcher object
//        Matcher matcher = pattern.matcher(password);
//
//        // Check match
//        if (matcher.matches()) {
//            System.out.println("Valid Password ✅");
//        } else {
//            System.out.println("Invalid Password ❌");
//        }
//
//        sc.close();
//    }
//}