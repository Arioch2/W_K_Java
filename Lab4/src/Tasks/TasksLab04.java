package Tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;


public class TasksLab04 {

    public void Task001(){

        int rozmiar  = 10;
        int [] tablica = new int [rozmiar];



        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = losujLiczbe(0,50);
        }


        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }

        double wynik = (double) suma/tablica.length;

        double wynik2 = 0;
        for(int liczba : tablica){
            wynik2 += liczba;
        }

        double srednia = wynik2/tablica.length;

        System.out.println("Suma tablicy: " + suma);
        System.out.println("Srednia: " + srednia);
        System.out.println("Wynik petli for: " + wynik);
        System.out.println("Wynik2 petli for each: " + wynik2);



    }

    private int losujLiczbe(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }


    public void Task002() {


        int [] tablicaParzysta = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < tablicaParzysta.length; i ++) {
            if (tablicaParzysta[i] % 2 == 0) {
                System.out.println(tablicaParzysta[i]);
            }
        }

        System.out.println("\n");

        int [] tablicaNieParzysta = {1,2,3,4,5,6,7,8,9,10,11};
        for (int i = 0; i < tablicaNieParzysta.length; i ++) {
            if (tablicaNieParzysta[i] % 2 != 0) {
                System.out.println(tablicaNieParzysta[i]);
            }
        }

    }


    public void Task003() {


        String [] slowa;
        slowa = new String[] {"ala", "ola", "jola", "kasia"};

        for (String elementy : slowa) {
            System.out.println(elementy.toUpperCase());
        }
    }

    public void Task004() {


        Scanner sc = new Scanner(System.in);
        String [] slowa = new String[5];

        System.out.println("Podaj 5 slow: \n");
        for (int i = 0; i < slowa.length; i++) {
            System.out.printf("Podaj %d slowo: ", i + 1);
            slowa[i] = sc.nextLine();
        }

        System.out.println("Wynik: ");
        for (int i = slowa.length-1; i >= 0; i--) {
            String odwrocone = new StringBuilder(slowa[i]).reverse().toString();//odwrocone slowa
            System.out.println(odwrocone);
        }
    }

    public void Task005() {

        Scanner sc = new Scanner(System.in);
        int [] tablicaliczb = new int[8];

        System.out.println("Podaj osiem liczb: \n");
        for (int i = 0; i < tablicaliczb.length; i++) {
            System.out.printf("Podaj %d liczbe: ", i+1);
            tablicaliczb[i] = sc.nextInt();

        }

        java.util.Arrays.sort(tablicaliczb);
        System.out.println("Posortowane liczby rosnaco: ");
        for(int liczba : tablicaliczb){
            System.out.println(liczba);
        }
    }


    public void Task006() {

        Scanner sc = new Scanner(System.in);
        int [] tablicaliczb2 = new int[5];

        System.out.println("Podaj piec liczb: \n");
        for (int i = 0; i < tablicaliczb2.length; i++) {
            System.out.printf("Podaj %d liczbe: ", i+1);
            tablicaliczb2[i] = sc.nextInt();
        }

        for (int liczba : tablicaliczb2) {
            int silnia = 1;
            for (int i = 1; i <= liczba; i++) {
                silnia *= i;
            }
            System.out.printf("\n Silnia liczby %d: %d\n", liczba, silnia);

        }
    }

    public void Task007() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza tablice: ");
        String tab1 = sc.nextLine();
        System.out.println("Podaj druga tablice: ");
        String tab2 = sc.nextLine();
        if (tab1.equals(tab2)) {
            System.out.println("Tablice sa takie same");
        }else System.out.println("Tablice sa rozne");
    }

}
