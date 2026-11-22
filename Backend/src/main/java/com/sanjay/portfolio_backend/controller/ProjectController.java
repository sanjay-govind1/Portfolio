package com.sanjay.portfolio_backend.controller;

import com.sanjay.portfolio_backend.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @GetMapping("/api/projects")
    public List<Project> getProjects(){
        Project project1 = new Project(
                1,
                "Smart Energy Monitoring System",
                "IoT-based energy monitoring and prediction using machine learning.",
                List.of("Python", "Django", "ESP32", "Raspberry Pi", "MQTT"),
                ""
        );

        Project project2 = new Project(
                2,
                "IoT Sensor Monitoring System",
                "Real-time monitoring of temperature, pitch and roll using sensors.",
                List.of("C++", "Qt", "Raspberry Pi", "MQTT", "ADXL345"),
                ""
        );

        Project project3 = new Project(
                3,
                "Recipe Management System",
                "A web application to create, manage and save recipes.",
                List.of("Python", "Django", "SQLite", "HTML", "CSS"),
                ""
        );

        List<Project> projects = List.of(project1, project2, project3);

        return projects;

    }

}
