import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter student index number: ");
        int indexNumber = scanner.nextInt();

        System.out.println("Enter student specialization: ");
        String specialization = scanner.next();

        System.out.println("Enter student year of study: ");
        int yearOfStudy = scanner.nextInt();


        Student student = new Student(name, lastName, indexNumber, specialization, yearOfStudy);


        student.pokazDane();

        scanner.close();


    }
}
