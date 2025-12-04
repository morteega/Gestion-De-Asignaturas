package application.repositories;
import java.time.LocalDate;


import application.models.*;
import java.util.ArrayList;

public class ExamsList {
    private ArrayList<Exam> examsList;
    
    public ExamsList() {
        this.examsList = new ArrayList<>();
    }
    public ExamsList(ArrayList<Exam> examsList) {
        this.examsList = examsList;
    }
    public ArrayList<Exam> getExamsList() {
        return examsList;
    }
    public void setExamsList(ArrayList<Exam> examsList) {
        this.examsList = examsList;
    }
    public void editExamDescription(int id, String newDescription) {
        this.examsList.get(id).setDescription(newDescription);
    }
    public void addExam(Exam exam) {
        this.examsList.add(exam);
    }
    public void editExamDate(int id, LocalDate newDate){
        this.examsList.get(id).setDate(newDate);
    }
    public void editExamDifficulty(int id, Difficulty newDifficulty){
        this.examsList.get(id).setDifficulty(newDifficulty);
    }
    public void editExamState(int id, ExamState newExamState){
        this.examsList.get(id).setExamState(newExamState);
}

