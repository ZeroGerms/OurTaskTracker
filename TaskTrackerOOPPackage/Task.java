package TaskTrackerOOPPackage;

public class Task {

	private String description;
	private boolean completed;
	
	public Task(String description) {
	this.description = description;
	this.completed = false;
	}
	
	public void markComplete() {
	completed = true;
	}
	
	@Override
	public String toString() {
	return description + (completed ? " [Done]" : " [Pending]");
	}
}
