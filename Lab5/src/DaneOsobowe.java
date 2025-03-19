public class DaneOsobowe  {

    private static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25, "Mężczyzna");
        Person person2 = new Person("Anna", "Nowak", 30, "Kobieta");
        Person person3 = new Person();

        person3.pokazDane();
        person3 = new Person("Piotr", "Żak", 30);


        person1.pokazDane();
        person2.pokazDane();
        person3.pokazDane();



        
    }

}
