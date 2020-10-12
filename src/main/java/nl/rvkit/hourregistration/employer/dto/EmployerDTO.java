package nl.rvkit.hourregistration.employer.dto;

import nl.rvkit.hourregistration.project.dto.ProjectDTO;

import java.util.List;

public class EmployerDTO {
    private long id;
    private String authId;
    private List<ProjectDTO> projects;
}
