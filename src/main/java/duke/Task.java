package duke;

import java.io.Serializable;

/**
 * Tasks are the tasks sent by the user to the Duke class
 */
public abstract class Task implements Serializable {
    //The name of the task.
    private String taskName;
    //Status on whether the task is done or not.
    private boolean isDone;

    /**
     * Instantiates an instance of a task.
     * @param taskName takes in the name of the task.*/
    public Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    /**
     * Sets the current task as done.
     */
    public void done() {
        this.isDone = true;
    }

    /**
     * Sets the current task as not done.
     */
    public void undo() {
        this.isDone = false;
    }

    /**
     * Shows the name of the task and its status.
     *
     * @return Name of task and its current status.
     */
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + taskName;
    }

    /**
     * Shows the status of the current task.
     *
     * @return Status of the current task.
     */
    public String getStatusIcon() {
        return this.isDone() ? "X" : " "; // mark done task with X
    }


    /**
     * Returns if the current task is done
     * @return Whether the task is done or not.
     */
    public boolean isDone() {
        return this.isDone;
    }

    /**
     * Returns the name of the task
     * @return taskName.
     */
    public String getTask() {
        return this.taskName;
    }

}
