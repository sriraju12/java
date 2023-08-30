package com.hcl.gic.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Tasks {

	@Id
	@GeneratedValue
	int id;
	String taskName;
	String startDate;
	String completionDate;
	String status;

	public Tasks(int id, String taskName, String startDate, String completionDate, String status) {

		this.id = id;
		this.taskName = taskName;
		this.startDate = startDate;
		this.completionDate = completionDate;
		this.status = status;
	}

	public Tasks() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
