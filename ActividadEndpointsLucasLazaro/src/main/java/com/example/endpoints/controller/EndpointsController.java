package com.example.endpoints.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.endpoints.entidades.Project;
import com.example.endpoints.services.ProjectService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/projects")
public class EndpointsController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/")
	@Operation(summary = "Enpoint para coger todos los proyectos")
	public ResponseEntity<List<Project>> getProjects(){
		return ResponseEntity.ok(projectService.obtenerTodosLosProjects());
	}
	
	@GetMapping("/getProject/{id}")
	@Operation(summary="Endpoint para buscar un proyecto por su id")
    public ResponseEntity<Project> obtenerProject(@PathVariable Long id) {
        Optional<Project> Project = projectService.obtenerProjectPorId(id);
        return Project.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	@PostMapping("/addProject")
	@Operation(summary="Endpoint para añadir un nuevo proyecto")
    public ResponseEntity<Project> crearProject(@RequestBody Project Project) {
        return ResponseEntity.ok(projectService.crearProject(Project));
    }
	
	@PutMapping("/actualizarProject/{id}")
	@Operation(summary="Endpoint para actualizar un proyecto")
    public ResponseEntity<Project> actualizarProject(@PathVariable Long id, @RequestBody Project Project) {
        Optional<Project> actualizado = projectService.actualizarProject(id, Project);
        return actualizado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	@DeleteMapping("/eliminarProject/{id}")
	@Operation(summary="Endpoint para eliminar un proyecto")
    public ResponseEntity<Void> eliminarProject(@PathVariable Long id) {
        if (projectService.eliminarProject(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
