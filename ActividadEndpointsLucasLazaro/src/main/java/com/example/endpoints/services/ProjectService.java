package com.example.endpoints.services;


import com.example.endpoints.entidades.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final List<Project> Projects = new ArrayList<>();
    private Long contadorId = 1L;

    public List<Project> obtenerTodosLosProjects() {
        return Projects;
    }

    public Optional<Project> obtenerProjectPorId(Long id) {
        return Projects.stream().filter(Project -> Project.getId().equals(id)).findFirst();
    }

    public Project crearProject(Project Project) {
        Project.setId(contadorId++);
        Projects.add(Project);
        return Project;
    }

    public Optional<Project> actualizarProject(Long id, Project ProjectActualizado) {
        return obtenerProjectPorId(id).map(Project -> {
            Project.setDescription(ProjectActualizado.getDescription());
            Project.setLanguage(ProjectActualizado.getLanguage());
            Project.setOpen(ProjectActualizado.getOpen());
            return Project;
        });
    }

    public boolean eliminarProject(Long id) {
        return Projects.removeIf(Project -> Project.getId().equals(id));
    }
}
