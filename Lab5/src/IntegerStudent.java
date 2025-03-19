public class IntegerStudent {

    private Student[] students;

    public IntegerStudent(String jan, String kowalski, int i, String computerScience, int i1) {
        students = new Student[100];
        initializeStudents();
    }

    private void initializeStudents() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("", "", 0, "", 0);
        }
    }

    public void insertStudent(String name, String lastName, int nrIndex, String specialization, int yearStudy) {
        if (nrIndex >= 0 && nrIndex < students.length) {
            students[nrIndex] = new Student(name, lastName, nrIndex, specialization, yearStudy);
        }
    }

    public void editStudent(int nrIndex, String name, String lastName, String specialization, int yearStudy) {
        if (nrIndex >= 0 && nrIndex < students.length) {
            students[nrIndex] = new Student(lastName, nrIndex, specialization, yearStudy);
        }
    }

    public void removeStudent(int nrIndex) {
        if (nrIndex >= 0 && nrIndex < students.length) {
            students[nrIndex] = new Student("", "", 0, "", 0);
        }
    }

    public void displayStudent(int nrIndex) {
        if (nrIndex >= 0 && nrIndex < students.length) {
            students[nrIndex].pokazDane();
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.pokazDane();
        }
    }
    
    public void displayStudentsInRange(int start, int end) {
        if (start >= 0 && start < students.length && end >= 0 && end < students.length && start <= end) {
            for (int i = start; i <= end; i++) {
                students[i].pokazDane();
            }
        }
    }

}
