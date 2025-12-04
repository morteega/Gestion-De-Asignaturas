package application.models;
import application.repositories.AssignmentsList;
import java.time.LocalDate;

public class Proyect {
    private String name;
    private Difficulty difficulty;
    private State state;
    private String description;
    private AssignmentsList assignmentsList;
    private LocalDate dueDate;

    public Proyect(String name, Difficulty difficulty, State state, String description,LocalDate dueDate) {
        this.name = name;
        this.difficulty = difficulty;
        this.state = state;
        this.description = description;
        this.dueDate = dueDate;
        this.assignmentsList = new AssignmentsList();
    }
    public String getName() {
        return name;
    }
    public Difficulty getDifficulty() {
        return difficulty;
    }
    public State getState() {
        return state;
    }
    public String getDescription() {
        return description;
    }
    public AssignmentsList getAssignmentsList() {
        return assignmentsList;
    }
    public LocalDate getDueDate(){
        return this.dueDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAssignmentsList(AssignmentsList assignmentsList) {
        this.assignmentsList = assignmentsList;
    }
    public void setDueDate(LocalDate dueDate){
        this.dueDate=dueDate;
    }
    
}
