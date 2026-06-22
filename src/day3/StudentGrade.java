package day3;

public class StudentGrade {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 60) {
            if (marks >= 75) {
                if (marks >= 90) {
                    System.out.println("Grade A");
                } else {
                    System.out.println("Grade B");
                }
            } else {
                System.out.println("Grade C");
            }
        } else {
            System.out.println("Fail");
        }
    }
}