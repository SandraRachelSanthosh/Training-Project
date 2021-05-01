package com.example.projectsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;


@Entity
@Table
public class Project {
    @Id
    @Column
    private int projectId;
    @Column
    private String listoftask;
    @Column
    private int projectManagerId;
    @Column
    private int priority;

    public Project() {
    }

    public Project(int projectId, String listoftask, int projectManagerId, int priority) {
        this.projectId = projectId;
        this.listoftask = listoftask;
        this.projectManagerId = projectManagerId;
        this.priority = priority;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getListoftask() {
        return listoftask;
    }

    public void setListoftask(String listoftask) {
        this.listoftask = listoftask;
    }

    public int getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(int projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
