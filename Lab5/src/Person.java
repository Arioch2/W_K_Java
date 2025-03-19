public class Person {
    private String name;
    private String lastName;
    private int age;


    public Person(String name, String lastName, int age, String mężczyzna) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String żak, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String pokazDane() {
        return "Imię: " + name + ", Nazwisko: " + lastName + ", Wiek: " + age;
    }
}
