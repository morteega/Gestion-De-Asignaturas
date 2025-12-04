package application.models;
import java.time.LocalDate;

public class Assignments {
    private String description;
    private State state;
    private LocalDate dueDate;

    public Assignments(String description, State state, LocalDate dueDate){
        this.description=description;
        this.state=state;
        this.dueDate=dueDate;
    }
    public String getDescription(){
        return description;
    }
    public State getState(){
        return state;
    }
    public LocalDate getDueDate(){
        return dueDate;
    }
    public void setLocalDate(LocalDate dueDate){
        this.dueDate=dueDate;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setSatte(State state){
        this.state=state;
    }
}
