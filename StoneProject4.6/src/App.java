import  java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Stone Week 3 Project");
        Task task1 = new Task("Complete Project ", "Finish TaskMaster Project", new Date(), Priority.HIGH, "Work");
        Task task2 = new Task("Grocery Shopping", "Buy Fruit and Vegetables", new Date(), Priority.MEDIUM, "Shopping");
        Task task3 = new Task("Gym", "Workout for a hour", new Date(), Priority.LOW, "Personal");
        TaskList taskList = new TaskList("My Tasks");
        System.out.println("All Tasks: ");
        for(Task task: taskList.getTasks()){
            System.out.println(task.getTaskDetails());
        }
        task1.markAsComplete();
        System.out.println("\nAfter marking task as complete: ");
        System.out.println(task1.getTaskDetails());
        String categoryToView = "Shopping";
        System.out.println("\nTasks in Category'" + categoryToView+ "':");
        for(Task task : taskList.viewTasksByCategory(categoryToView)){
        System.out.println(task.getTaskDetails());

        }

    }
}
