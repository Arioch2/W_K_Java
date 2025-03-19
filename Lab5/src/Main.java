public class Main {
    public static void main(String[] args) {


//        Student student1 = new Student("Jan ","Kowalski ", 18 , "Computer Science ", 3);
//        Student student2 = new Student("Nowak ", 20 , "Biology ", 2);
//        Student student3 = new Student(19 , "Mathematics ", 4);
//        Student student4 = new Student("Chemistry ", 1);
//
//
//        student1.pokazDane();
//        student2.pokazDane();
//        student3.pokazDane();
//        student4.pokazDane();


        IntegerStudent integerStudent = new IntegerStudent("Jan ", "Kowalski ", 18 , "Computer Science ", 3);

        System.out.println("Displaying Student at index 0:");
        integerStudent.displayStudent(0);

        integerStudent.editStudent(0, "Jane", "Doe", "It", 4);

        System.out.println("\nDisplaying Student at index 0:");
        integerStudent.displayStudent(0);

        integerStudent.removeStudent(0);

        System.out.println("\nDisplaying Students:");
        integerStudent.displayAllStudents();

        System.out.println("\nDisplaying students from index 0 to 10:");
        integerStudent.displayStudentsInRange(0, 10);


    }

    public static class MainStudent {
    }
}