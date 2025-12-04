package application.controllers;
import  application.repositories.ExamsList;
import application.models.Difficulty;
import application.models.ExamState;
import application.models.Exam;
import java.util.Scanner;
import java.time.LocalDate;


public class ExamController {
    public static final Scanner SCANNER = new Scanner(System.in);
    private ExamsList examList;
    
    public ExamController(ExamsList examList) {
        this.examList = examList;
    }
    public ExamsList getExamList() {
        return examList;
    }
    public void setExamList(ExamsList examList) {
        this.examList = examList;
    }

    public void editExamDescription(){
        System.out.print("Enter the exam ID to edit: ");
        int id = SCANNER.nextInt();
        SCANNER.nextLine();
        id-=1; // Consume newline
        System.out.print("Enter the new description: ");
        String newDescription = SCANNER.nextLine();
        examList.editExamDescription(id, newDescription);
    }
    public void addNewExam(){//Tengo que pedir tambien la dificultad del examen (1,2 o 3) y su estado (1,2 o 3)
        String description = getDescriptionFromInput();//tambien habria que pedir el numero del examen para poder editar el correcto
        LocalDate date = getDateFromInput();
        Difficulty difficulty = getDifficultyFromOption();
        ExamState examState = getExamStateFromOption();
        this.examList.addExam(new Exam(description, date, difficulty, examState));
    }
    public void editExamDate(){
        System.out.print("Enter the exam ID to edit: ");
        int id = SCANNER.nextInt();
        SCANNER.nextLine(); // Consume newline
        LocalDate newDate = getDateFromInput();
        
    }


    private String getDescriptionFromInput(){
        System.out.print("Enter exam description: \n");
        String description = SCANNER.nextLine();
        return description;
    }

    private LocalDate getDateFromInput(){
        System.out.print("Enter exam date (YYYY-MM-DD): \n");
        String dateInput = SCANNER.nextLine();
        LocalDate date = LocalDate.parse(dateInput);
        return date;
    }

    private ExamState getExamStateFromOption(){
        System.out.println("What state is this exam in?\n (1)NOT STARTED\n (2)IN PROGRESS\n (3)COMPLETED");
        int stateOption=SCANNER.nextInt();
        SCANNER.nextLine();
        ExamState examState;
        switch(stateOption){
            case 1:
                examState=ExamState.NOT_STARTED;
                break;
            case 2:
                examState=ExamState.IN_PROGRESS;
                break;
            case 3:
                examState=ExamState.FINISHED;
                break;
            default:
                System.out.println("Invalid option. Setting state to NOT STARTED by default.");
                examState=ExamState.NOT_STARTED;
                break;
        }
        return examState;
    }


    private Difficulty getDifficultyFromOption(){
        System.out.println("What difficiulty does this exam have?\n (1,2,3).");
        int difficultyOption=SCANNER.nextInt();
        SCANNER.nextLine();
        Difficulty difficulty;
        switch(difficultyOption){
            case 1:
                difficulty=Difficulty.EASY;
                break;
            case 2:
                difficulty=Difficulty.MEDIUM;
                break;
            case 3:
                difficulty=Difficulty.HARD;
                break;
            default:
                System.out.println("Invalid option. Setting difficulty to EASY by default.");
                difficulty=Difficulty.EASY;
                break;
        }
        return difficulty;
    }
}


