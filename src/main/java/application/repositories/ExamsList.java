package application.repositories;


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
}

