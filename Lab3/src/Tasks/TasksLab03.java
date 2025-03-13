package Tasks;

import java.util.Random;
import java.util.Scanner;

public class TasksLab03 {

    public void Task001() {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilosc studentow: ");
        int liczbastu = in.nextInt();

        int i = 0;
        int punkty;
        float suma = 0;
        float srednia;

        while (i < liczbastu){
            System.out.printf("Podaj punkty dla %d: ",i+1);
            punkty = in.nextInt();
            suma += punkty;
            i++;

        }

        srednia = suma/liczbastu;
        System.out.println("Srednia: " + srednia);


    }


    public void Task002() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");


        int dodatnie = 0;
        int ujemne = 0;
        int iloscdodatnie = 0;
        int iloscujemne = 0;

       for (int i = 0; i < 10; i++){
           System.out.printf("Podaj %d liczbe: ",i+1);
           int liczby = in.nextInt();
           if (liczby < 0){
               ujemne += liczby;
               iloscujemne++;

           }else {
               dodatnie += liczby;
               iloscdodatnie++;
           }

       }
        System.out.println("Suma liczb ujemnych: " + ujemne+" \nSuma liczb dodatnich: " + dodatnie);
        System.out.println("Ilosc ujemnych: " + iloscujemne+" \nIlosc dodatnich: " + iloscdodatnie);
    }

    public void Task003() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe ktora okresli dlugosc zbioru: ");
        int zbior = in.nextInt();

        int suma = 0;


        for (int i = 0; i <= zbior; i++){
            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("Suma liczb parzystych: " + suma);
    }

    public void Task004() {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb do wylosowania z przedziału (-10,45): ");
        int ilosc = in.nextInt();
        Random random = new Random();

        int liczba = 0;
        int suma = 0;

        for (int i = 0; i < ilosc; i++){
            liczba = random.nextInt(-10,45);
            if (i % 2 == 0){
                suma += liczba;
            }

        }
        System.out.println("Suma wylosowanych liczb parzystych z przedzialu (-10,45): " + suma);

    }

    public void Task005() {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        String slowo = in.nextLine();
        String reversed = new StringBuilder(slowo).reverse().toString();
        if (slowo.equals(reversed)){
            System.out.println("Podane slowo jest palindromem: ");

        }else {
            System.out.println("Podane slowo nie jest palindromem: ");
        }



    }

}
