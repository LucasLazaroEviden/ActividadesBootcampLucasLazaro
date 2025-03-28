package com.example.endpoints.services;


import com.example.endpoints.entidades.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final List<Project> Projects = new ArrayList<>();

    public List<Project> obtenerTodosLosProjects() {
        return Projects;
    }

    public Optional<Project> obtenerProjectPorId(Long id) {
        return Projects.stream().filter(Project -> Project.getId().equals(id)).findFirst();
    }

    public Project crearProject(Project Project) {
        Projects.add(Project);
        return Project;
    }

    public Optional<Project> actualizarProject(Long id, Project projectActualizado) {
        return obtenerProjectPorId(id).map(project -> {
            project.setDescription(projectActualizado.getDescription());
            project.setLanguage(projectActualizado.getLanguage());
            project.setOpen(projectActualizado.getOpen());
            project.setCodes(projectActualizado.getCodes());
            project.setUsers(projectActualizado.getUsers());
            project.setDetail(projectActualizado.getDetail());
            return project;
        });
    }

    public boolean eliminarProject(Long id) {
        return Projects.removeIf(Project -> Project.getId().equals(id));
    }
}
