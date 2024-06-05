package entities;
import entities.status;

import java.time.LocalDate;
import java.util.Objects;

public class TaskManager {
	private static int taskId=100;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private status status;
	private boolean active;
	public TaskManager(String taskName, String description, LocalDate taskDate, status status,
			boolean active) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
		this.taskId++;
	}
      
		public TaskManager(int taskId2, String taskName2, String description2, String taskDate2, String statuss,
			boolean active2) {
		// TODO Auto-generated constructor stub
	}
	public TaskManager(int taskId2) {
			super();
			this.taskId=taskId2;
		}

	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public status getStatus() {
		return status;
	}
	public void setStatus(status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskManager other = (TaskManager) obj;
		return taskId==other.taskId;
	}

	@Override
	public String toString() {
		return "TaskManager [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description
				+ ", taskDate=" + taskDate + ", status=" + status + ", active=" + active + "]\n";
	}
	
	
	
}
