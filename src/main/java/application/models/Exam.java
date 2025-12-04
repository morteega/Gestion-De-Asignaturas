package application.models;
import java.util.Scanner;

import java.time.LocalDate;

public class Exam {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String description;
    private LocalDate date;
    private Difficulty difficulty;
    private ExamState examState;

    public Exam(String description, LocalDate date, Difficulty difficulty, ExamState examState){ 
        this.description = description;
        this.date = date;
        this.difficulty = difficulty;
        this.examState = examState;
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
    public void setDifficulty(Difficulty difficulty){
        this.difficulty=difficulty;
    }
    public Difficulty getDifficulty(){
        return this.difficulty;
    }
    public void setExamState(ExamState examState){
        this.examState=examState;
    }
    public ExamState getExamState(){
        return this.examState;
    }
}

