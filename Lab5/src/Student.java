public class Student {

    private String name;
    private String lastName;
    private int nrIndex;
    private String specialization;
    private int yearStudy;

    public Student(String name, String lastName, int nrIndex, String specialization, int yearStudy) {
        this.name = name;
        this.lastName = lastName;
        this.nrIndex = nrIndex;
        this.specialization = specialization;
        this.yearStudy = yearStudy;
    }

    public Student(String lastName, int nrIndex, String specialization, int yearStudy) {
        this.lastName = lastName;
        this.nrIndex = nrIndex;
        this.specialization = specialization;
        this.yearStudy = yearStudy;
    }

    public Student(int nrIndex, String specialization, int yearStudy) {
        this.nrIndex = nrIndex;
        this.specialization = specialization;
        this.yearStudy = yearStudy;
    }

    public Student(String specialization, int yearStudy) {
        this.specialization = specialization;
        this.yearStudy = yearStudy;
    }

    public void pokazDane(){

        System.out.println("Imie: " + name+"Nazwisko: " + lastName+ "Nr Index"+ nrIndex + "Specjalizacja: " + specialization + "Rok studiow: " + yearStudy);
    }








}
