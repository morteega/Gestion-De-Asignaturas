package application.controllers;
import  application.repositories.ExamsList;
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
        SCANNER.nextLine(); // Consume newline
        System.out.print("Enter the new description: ");
        String newDescription = SCANNER.nextLine();
        examList.editExamDescription(id, newDescription);
    }
    public void addNewExam(){//Tengo que pedir tambien la dificultad del examen (1,2 o 3) y su estado (1,2 o 3)
        System.out.print("Enter exam description: ");
        String description = SCANNER.nextLine();
        System.out.print("Enter exam date (YYYY-MM-DD): ");
        String dateInput = SCANNER.nextLine();
        LocalDate date = LocalDate.parse(dateInput);
        examList.getExamsList().add(new application.models.Exam(description, date));
    }
}
