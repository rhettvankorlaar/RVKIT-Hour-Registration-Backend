package nl.rvkit.hourregistration.project;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    private final IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }
}
