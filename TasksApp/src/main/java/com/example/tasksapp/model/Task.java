package com.example.tasksapp.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private int taskOwner;
    @Column
    private int parentTask;
    @Column
    private int priority;
    @Column
    private String taskStatus;

    public Task() {
    }

    public Task(int taskId, String startDate, String endDate, int taskOwner, int parentTask, int priority,String taskStatus) {
        this.taskId = taskId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskOwner = taskOwner;
        this.parentTask = parentTask;
        this.priority = priority;
        this.taskStatus = taskStatus;
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

    public int getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner( int taskOwner) {
        this.taskOwner = taskOwner;
    }

    public int getParentTask() {
        return parentTask;
    }

    public void setParentTask(int parentTask) {
        this.parentTask = parentTask;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
