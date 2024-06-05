package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import CustomException.CustomException;
import entities.TaskManager;
import entities.status;

public class Taskutils 
{

	public static TaskManager addTask(String taskName, String description, String taskDate, String statuss,
			boolean active) throws CustomException
	{
		LocalDate task_Date=LocalDate.parse(taskDate);
		status task_status=status.valueOf(statuss.toUpperCase());
		return new TaskManager(taskName,description,task_Date,task_status,active);
	
	}
	public static String deleteTask(int taskId,List<TaskManager>task)throws CustomException {
		TaskManager tm=new TaskManager(taskId);
		int index=task.indexOf(tm);
		System.out.println(index);
//		if(index==-1)
//			throw new CustomException("No such task found");
		TaskManager tk=task.get(index);
		tk.setActive(false);
		return "Task Succesfully deleted";
		
	}
	
	public static String updateStatus(int id, String ustatus, List<TaskManager> task) {
		status update_status=status.valueOf(ustatus.toUpperCase());
		TaskManager us=new TaskManager(id);
		int index=task.indexOf(us);
		if(index==-1)
			throw new CustomException("No such task found");
		TaskManager ut=task.get(index);
		ut.setStatus(update_status);
		
		return "Status Succesfully updated";
	}
	public static List<TaskManager> displayPendingTask(List<TaskManager> task) {
		List<TaskManager> pendingTask=new ArrayList<TaskManager>();
		status st=status.PENDING;
		for(TaskManager t:task) {
			if(t.getStatus()==st) {
				pendingTask.add(t);
			}
		}		
		return pendingTask;
	}
	public static List<TaskManager> todaysPendingTask(List<TaskManager> task) {
		status pstatus=status.PENDING;
		List<TaskManager> lt=new ArrayList<TaskManager>();
		
		for(TaskManager t:task) {
			if(t.getStatus()==pstatus&&t.getTaskDate().equals(LocalDate.now())) {
				lt.add(t);
			}
		}
		return lt;
	}
	
}
