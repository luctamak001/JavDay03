import java.util.Scanner;

public class Bio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // TODO: prompt for the age.
        System.out.print("Enter your age: ");
        // TODO: use input.nextInt() to start age.
        int age = input.nextInt();

        // TODO: prompt for GPA.
        System.out.print("Enter your gpa: ");
        double gpa = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        System.out.print("Enter your favorite number: ");
        String favNumStr = input.nextLine();
        int favNum = Integer.parseInt(favNumStr);
        System.out.println("Favorite Number: " + favNum);



        int gpaTruncated = (int) gpa;

        Integer gpaTruncatedWrapper = gpaTruncated;

        // I am
        // now done

        /*
        With the
        assignment.
         */

    }
}
