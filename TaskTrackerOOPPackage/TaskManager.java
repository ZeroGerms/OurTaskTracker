package TaskTrackerOOPPackage;
import java.util.ArrayList;

public class TaskManager {

	private ArrayList<Task> tasks = new ArrayList<>();
	// no constructor
	
	public void addTask(String desc) {
	tasks.add(new Task(desc));
	}
	
	public void completeTask(int index) {
	tasks.get(index).markComplete();
	}
	
	public ArrayList<Task> getTasks() {
	return tasks;
	}

	
}
