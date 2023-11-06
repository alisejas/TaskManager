import java.util.ArrayList;
import java.util.List;
public class TaskList {
    private String ListName;
    private List<Task> tasks;
    public TaskList(String listName){
        this.ListName = listName;
        this.tasks = new ArrayList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(Task task){
        tasks.remove(task);
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public List<Task> addList(){
        return tasks;
    }
    public List<Task> viewTasksByCategory(String category){
        List<Task> tasksByCategory  = new ArrayList<>();
    for(Task task : tasks){
        if(Task.getCategory().equals(category)){
            tasksByCategory.add(task);
        }
    }
    return tasksByCategory;
}
}