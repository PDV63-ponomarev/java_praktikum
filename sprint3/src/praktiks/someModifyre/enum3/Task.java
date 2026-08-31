package praktiks.someModifyre.enum3;

public class Task {
    private TaskPriority priority;

    enum TaskPriority{
        HIGH,
        MEDIUM,
        LOW
    }
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
