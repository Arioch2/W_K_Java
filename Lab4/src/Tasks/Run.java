package Tasks;

public class Run {

    //obiekt klasy tasks
    TasksLab04 tasksLab04 = new TasksLab04();
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
            case 1: tasksLab04.Task001();
            break;
            case 2: tasksLab04.Task002();
            break;
            case 3: tasksLab04.Task003();
            break;
            case 4: tasksLab04.Task004();
            break;
            case 5: tasksLab04.Task005();
            break;
            case 6: tasksLab04.Task006();
            break;
            case 7: tasksLab04.Task007();
            break;
        }

    }// koniec metody menu


}// koniec klasy
