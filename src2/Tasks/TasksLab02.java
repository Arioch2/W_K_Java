package Tasks;

import java.util.Scanner;

public class TasksLab02 {

    InputData inputData = new InputData();
    //ax2+bx+c=0

    public void Task001() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj a: ");
        int a = sc.nextInt();
        System.out.println("Podaj b: ");
        int b = sc.nextInt();
        System.out.println("Podaj c: ");
        int c = sc.nextInt();

        System.out.println("Wzor: "+a+"x^2"+b+"x"+c+"=0\n");

        int x1 = (int) (-b + Math.sqrt(b*b - 4 * a * c)) / (2*a);
        int x2 = (int) (-b + Math.sqrt(b*b - 4 * a * c)) / (2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);


    }

    public void Task002() {

        System.out.println("Podaj x: ");
        double x = inputData.InputDouble();

        double wynikAx = a2(x);
        double wynikBx = b2(x);
        double wynikCx = c2(x);

        System.out.println("Wynik dla x = " + x+"\n");
        System.out.println("a(x) = " + wynikAx);
        System.out.println("\nb(x) = " + wynikBx);
        System.out.println("\nc(x) = " + wynikCx);

    }

    private double a2(double x) {
        if (x > 0) {
            return 2 * x;
        }else if (x==0) {
            return 0;
        }
        else {
            return -3 * x;
        }
    }

    private double b2(double x) {

        if (x >=1){
            return x*x;
        }
        else{
            return x;
        }

    }
    private double c2(double x) {
        if (x >2){
            return 2+x;
        }
        else if (x==2){
            return 8;
        }
        else {
            return x-4;
        }
    }

    public void Task003() {

        System.out.printf("Podaj x: ");
        int x = inputData.InputInt();
        System.out.printf("Podaj y: ");
        int y = inputData.InputInt();
        System.out.printf("Podaj z: ");
        int z = inputData.InputInt();

        int temp;
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z){
            temp = y;
            y = z;
            z = temp;
        }
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        System.out.printf("Posortowane liczby: %d %d %d\n",x,y,z);
        System.out.print("\nTask 3 completed");

    }

    public void Task004() {

        System.out.printf("Czy pada deszcz (true/false): ");
        boolean Deszcz = inputData.InputBool();
        System.out.printf("Czy jest autobus na przystanku (true/false): ");
        boolean Autobus = inputData.InputBool();

        if (Deszcz && Autobus){
            System.out.printf("Wez parasol");
            System.out.printf("Dostaniesz sie na uczelnie");
        } else if (Deszcz && !Autobus){
            System.out.printf("Nie dostaniesz sie na uczelnie");
        } else if (!Deszcz && Autobus){
            System.out.printf("Dostaniesz sie na uczelnie");
            System.out.printf("Milego dnia i pieknej pogody");
        }else System.out.println("Nie dostaniesz sie na uczelnie");

        System.out.printf("\nTask 4 completed");

    }

    public void Task005() {
        System.out.print("Czy jest znizka na samochod (true/false): ");
        boolean Samochod = inputData.InputBool();
        System.out.print("Czy dostales premie (true/false):");
        boolean Premia = inputData.InputBool();

        if (!Samochod && !Premia) {
            System.out.print("Zakup samochodu trzeba odłożyć na później\nZniżki na samochód nie ma");
        } else if (!Samochod || Premia) {
            System.out.print("Możesz kupić samochód\n");
            if (!Samochod) {
                System.out.print("Zniżki na samochód nie ma");
            }
        } else if (Samochod || !Premia) {
            System.out.print("Możesz kupić samochód\n");


        }
    }

    public void Task006() {
        System.out.println("Wybierz działanie jakie chcesz wykonac: \n");
        System.out.println("n1. Dodawanie \n"+"n2. Odejmowanie\n"+"n3. Mnozenie\n"+"n4. Dzielenie");
        int wybor = inputData.InputInt();
        System.out.println("Podaj pierwsza liczbe: ");
        int a = inputData.InputInt();
        System.out.println("Podaj druga liczbe: ");
        int b = inputData.InputInt();

        switch (wybor){
            case 1:
                int suma = a+b;
                System.out.println("Wynik dodawania: "+suma);
                break;
                case 2:
                    int roznica = a-b;
                    System.out.println("Wynik odejmowania: "+roznica);
                    break;
                    case 3:
                        int iloczyn = a*b;
                        System.out.println("Wynik mnozenia: "+iloczyn);
                        break;
                        case 4:
                            if(b != 0) {
                                int iloraz = a / b;
                                System.out.println("Wynik dzielenia: " + iloraz);
                            }else System.out.println("Nie mozna dzielic przez 0");
                            break;
            default:
                System.out.println("Bledne dane");
        }
    }
}
