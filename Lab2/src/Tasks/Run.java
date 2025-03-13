package Tasks;

public class Run {

    //obiekt klasy tasks
    TasksLab02 tasksLab02 = new TasksLab02();
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
        System.out.println("7. Exit");
        System.out.println("Select a task: ");
        int choose = inputData.InputInt();
        switch (choose){
            case 1: tasksLab02.Task001();
            break;
            case 2: tasksLab02.Task002();
            break;
            case 3: tasksLab02.Task003();
            break;
            case 4: tasksLab02.Task004();
            break;
            case 5: tasksLab02.Task005();
            break;
            case 6: tasksLab02.Task006();
            break;

        }

    }// koniec metody menu


}// koniec klasy
