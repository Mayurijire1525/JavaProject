package customordering;

import java.util.Comparator;

import entities.TaskManager;


public class TasksortedByDate implements Comparator<TaskManager>{

	@Override
	public int compare(TaskManager t1,TaskManager t2) {
		return t1.getTaskDate().compareTo(t2.getTaskDate());
		
	}
}
