package application.repositories;
import java.util.ArrayList;
import application.models.Subject;

public class SubjectList {
    private ArrayList<Subject> subjects;

    public SubjectList(){
        this.subjects = new ArrayList<>();
    }
    public SubjectList(ArrayList<Subject> subjects){
        this.subjects = subjects;
    }
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    
}
