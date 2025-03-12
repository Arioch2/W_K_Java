package Tasks;

import java.util.Scanner;

public class TasksLab01 {
    private String name = "Wojciech Knapik";
    private int age = 20;

    //Funckja Task001 przyjmuje dwa argumenty 'name'(ciąg znaków) oraz 'age'(liczba całkowita)
    protected String Task001(String name, int age){
        return name + age;
    }

    //Metoda Task001 drukuje imię i wiek
    //Nie przyjmuje żadnych argumentów i korzysta z wartości zmiennych 'name' i 'age'
    public void Task001() {
        System.out.println("Imie: " + name+ " Wiek: " + age);
    }

    //Metoda Task002 odczytuje 2 liczby podane przez uzytkownika i oblicza ich sume, roznice i iloczyn
    public void Task002() {

        //Tworzenie obiektu Scanner do odczytu danych
        Scanner sc = new Scanner(System.in);

        //Wyświetlenie komunikaatu i odczytanie pierwszej liczby
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaliczba = sc.nextInt();

        //Wyświetlenie komunikaatu i odczytanie drugiej liczby
        System.out.println("Podaj druga liczbe: ");
        int drugaliczba = sc.nextInt();

        //Wykonanie działań i przypisanie ich do zmiennych
        int suma = pierwszaliczba + drugaliczba;
        int roznica = pierwszaliczba - drugaliczba;
        int iloczyn = pierwszaliczba * drugaliczba;

        //Wyświetlenie wyników na konsoli
        System.out.println("Suma: " + suma+ " Roznica: " + roznica+ " Iloczyn: " + iloczyn);

    }

    //Metoda Task003 odczytuje liczbe podana przez uzytkownika i sprawdza czy jest parzysta
    public void Task003() {

        //Tworzenie obiektu Scanner do odczytu danych
        Scanner sc = new Scanner(System.in);
        //Wyświetlenie komunikatu i odczytanie liczby
        System.out.println("Podaj liczbe w celu sprawdzenia parzystosci: ");
        int liczba = sc.nextInt();

        //Stworzenie warunku sprawdzającego parzystość, warunek zwraca odpowiednio True lub False(warunek wykorzystuje modulo)
        if (liczba %2 == 0){
            System.out.println("True");
        }else System.out.println("False");

    }

    //Metoda Task004 odcztyuje liczbe podana przez uzytkownika i sprawdza podzielnosc przez 3 i 5.
    public void Task004() {

        //Tworzenie obiektu Scanner do odczytu danych
        Scanner sc = new Scanner(System.in);

        //Wyświetlenie komunikatu i odczytanie liczby
        System.out.println("Podaj liczbe w celu sprawdzenia podzielnosci przez 3 i 5: ");
        int liczba = sc.nextInt();

        //Stworzenie warunku sprawdzającego podzielnosc, warunek zwraca odpowiednio True lub False(warunek wykorzystuje modulo)
        if (liczba % 3 == 0){
            if (liczba % 5 == 0){
                System.out.println("True");
            }else System.out.println("False");
        }

    }

    //Metoda Task005 odczytuje liczbe podana przez uzytownika i podnosi ja do potegi 3
    public void Task005() {

        //Tworzenie obiektu Scanner do odczytu danych
        Scanner sc = new Scanner(System.in);
        //Wyświetlenie komunikatu i odczytanie liczby
        System.out.println("Podaj liczbe ktora zostanie podniesiona do potegi 3: ");
        int liczba = sc.nextInt();

        //Podniesienie liczby podanej przez uzytkwonika do potegi 3 z wykorzystaniem klasy Math i wyswietlenie wyniku
        //Math.pow służy do podniesienia liczby do potegi
        int liczbadopotegi = (int) Math.pow(liczba, 3);
        System.out.println("Twoja liczba podniesiona do potegi 3 to: " + liczbadopotegi);
    }

    //Metoda Task006 odczytuje liczbe podana przez uzytkownika i oblicza z niej pierwiastek kwadratowy
    public void Task006() {

        //Tworzenie obiektu Scanner do odczytu danych
        Scanner sc = new Scanner(System.in);

        //Wyświetlenie komunikatu i odczytanie liczby
        System.out.println("Podaj liczbe z której zostanie obliczony pierwiastek kwadratowy: ");
        int liczba = sc.nextInt();

        //Obliczenie pierwiastka kwadratowego z podanej przez uzytkownika liczby z wykorzystaniem klasy Math i wyswietlenie wyniku
        //Math.sqrt służy do obliczenia pierwiastka kwadratowego
        int pierwiastekkwadratowy = (int) Math.sqrt(liczba);
        System.out.println("Pierwiastek kwadratowy z twojej liczby to: " + pierwiastekkwadratowy);
    }




    private class SprawdzenieTrojkata {

        public boolean PoprawnyTrojkat(int a, int b, int c){
            int max = Math.max(a, Math.max(b,c));
            int sumakwadratu = a*a + b*b + c*c;
            int maxtrojkata = max * max;

            return sumakwadratu - maxtrojkata == maxtrojkata;
        }

    }


    public void Task007() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj początkową liczbę przedziału z którego zostaną wylosowane wartości: ");
        int a = sc.nextInt();
        System.out.println("Podaj koncowa liczbe przedziału: ");
        int b = sc.nextInt();

        int x = a + (int) (Math.random() * (b - a + 1));
        int y = a + (int) (Math.random() * (b - a + 1));
        int z = a + (int) (Math.random() * (b - a + 1));

        System.out.println("Wylosowane liczby to: " + x + " " + y + " " + z);

        SprawdzenieTrojkata sprawdzenieTrojkata = new SprawdzenieTrojkata();
        boolean wynik = sprawdzenieTrojkata.PoprawnyTrojkat(x,y,z);

        System.out.println("Czy mozna zbudować trojkat prostokatny? " + wynik);

    }


}
