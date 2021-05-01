package com.example.projectsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projectsapp.service.ProjectService;
import com.example.projectsapp.model.Project;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/projects")
    private List<Project> getAllProjects()
    {
        return projectService.getAllProjects();
    }

    @GetMapping ("/{projectid}")
    private Project getProjectById(@PathVariable("projectid") int projectid)
    {
        return projectService.getProjectById(projectid);
    }

    @PostMapping("/")
    private int saveProject(@RequestBody Project project)
    {
        projectService.saveOrUpdate(project);
        return project.getProjectId();
    }

    @DeleteMapping("/{projectid}")
    private void deleteProject(@PathVariable("projectid") int projectid)
    {
        projectService.delete(projectid);
    }

    @PutMapping("/")
    private Project update(@RequestBody Project project)
    {
        projectService.saveOrUpdate(project);
        return project;
    }

}


