package tester;

import static utils.Taskutils.addTask;
import static utils.Taskutils.deleteTask;
//import utils.Taskvalidation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import customordering.TasksortedByDate;
import entities.TaskManager;
import utils.Taskutils;

public class Tasks {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<TaskManager> task = new ArrayList<>();

			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"1.Add New Task/n 2.Delete a task. /n 3.Update task status./n 4.Display all pending tasks./n 5. Display all pending tasks for today./n 6.Display all tasks sorted by taskDate\n");
					System.out.println("Enter your choice");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the details-taskName,description,taskDate,status,active");
						task.add(addTask(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextBoolean()));
						System.out.println("Task added succesfully");
						break;
					case 2:
						System.out.println("Enter id of task to be deleted");
						System.out.println(deleteTask(sc.nextInt(), task));
						// System.out.println("Task added succesfully:"+
						// Taskvalidation.DeleteTask(sc.nextInt(),task));
						break;
					case 3:
						System.out.println("Enter id and status");
						System.out.println(Taskutils.updateStatus(sc.nextInt(), sc.next(), task));
						break;
					case 4:
						System.out.println("Pending Tasks");
						System.out.println(Taskutils.displayPendingTask(task));

						break;
					case 5:
						System.out.println("Enter today date");
						System.out.println(Taskutils.todaysPendingTask(task));
						break;
					case 6:
						
						Collections.sort(task,new TasksortedByDate());
						System.out.println("succesfully sorted by date");
						System.out.println(task);
						break;
					case 7:
						exit = true;
						break;
					default:

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}

		}
	}

}
