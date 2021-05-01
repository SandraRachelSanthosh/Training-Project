package com.example.tasksapp.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {

    @Id
    @Column
    private int taskId;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private String taskOwner;
    @Column
    private String parentTask;
    @Column
    private int priority;

    public Task() {
    }

    public Task(int taskId, String startDate, String endDate, String taskOwner, String parentTask, int priority) {
        this.taskId = taskId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskOwner = taskOwner;
        this.parentTask = parentTask;
        this.priority = priority;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(String taskOwner) {
        this.taskOwner = taskOwner;
    }

    public String getParentTask() {
        return parentTask;
    }

    public void setParentTask(String parentTask) {
        this.parentTask = parentTask;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
