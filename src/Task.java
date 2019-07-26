import java.time.LocalDate;

public class Task {

	//instance variables
	private String name;
	private String desc;
	private LocalDate dueDate;
	private boolean completed;
	
	
	//constructor
	public Task(String name, String desc, LocalDate dueDate) {
		this.name=name;
		this.desc=desc;
		this.dueDate=dueDate;
	}
	
	public Task() {
		name = "";
		desc = "";
		dueDate = null;
	}

	//getters and setters for the above parameters (name, desc, dueDate, completed)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Description: " + desc + ", Due Date: " + dueDate + ", Completed?: " + completed;
	}
	
}
