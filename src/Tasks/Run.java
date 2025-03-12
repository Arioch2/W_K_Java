package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab01 tasksLab01 = new TasksLab01();
    // obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void RunMain() {

        Menu();
    } // koniec metody runmain

    private void Menu() {
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Task 3");
        System.out.println("4. Task 4");
        System.out.println("5. Task 5");
        System.out.println("6. Task 6");
        System.out.println("7. Task 7");
        System.out.println("8. Exit");
        System.out.println("Select a task: ");
        int choose = inputData.InputInt();


        switch (choose){
            case 1: tasksLab01.Task001();
            break;
            case 2: tasksLab01.Task002();
            break;
            case 3: tasksLab01.Task003();
            break;
            case 4: tasksLab01.Task004();
            break;
            case 5: tasksLab01.Task005();
            break;
            case 6: tasksLab01.Task006();
            break;
            case 7: tasksLab01.Task007();
            break;



        }

    }// koniec metody menu


}// koniec klasy
