package application.models;
import java.util.Scanner;

import java.time.LocalDate;

public class Exam {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String description;
    private LocalDate date;
    private Difficulty difficulty;
    private ExamState examState;

    public Exam(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date){
        this.date=date;
    }
    public void setDescription(String description){
        this.description=description;
    }
    
}

