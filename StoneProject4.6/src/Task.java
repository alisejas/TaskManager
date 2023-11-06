import java.util.Date;
public class Task {
   private String TaskName;
   private String TaskDescription;
    private Date DueDate;
    private Priority Ppriorty;
    private static String Category;
    private boolean CompletionStatus;
    public Task(String taskName, String taskDescription, Date dueDate, Priority ppriority, String category){
        this.TaskName = taskName;
        this.TaskDescription = taskDescription;
        this.DueDate = dueDate;
        this.Ppriorty = ppriority;
        this.Category = category;
        this.CompletionStatus = false;
    }
    public String getTaskDetails(){
        return "Task: " +TaskName+ "\nDescription: " +TaskDescription+ "\nDue Date: " +DueDate+ "\nPriority: " +Ppriorty+ "\nCategory: " +Category+ "\nStatus: " +(CompletionStatus ? "Completed" : "Incomplete");
    }
    public void markAsComplete(){
        this.CompletionStatus = true;
    }
    public static String getCategory(){
        return Category;
    }
    public static String setCategory(){
        return Category;
    }
public void updateTaskDetails(String newDescription, Date newDueDate, Priority newPpriority){
    this.TaskDescription = newDescription;
    this.DueDate = newDueDate;
    this.Ppriorty = newPpriority;
}
}
