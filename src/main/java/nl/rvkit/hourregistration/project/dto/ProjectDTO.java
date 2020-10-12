package nl.rvkit.hourregistration.project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rvkit.hourregistration.employer.dto.EmployerDTO;
import nl.rvkit.hourregistration.hourentry.dto.HourEntryDTO;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProjectDTO {
    private long id;
    private String name;
    private String authId;
    private double rate;
    private boolean isDayRate;
    private EmployerDTO employer;
    private List<HourEntryDTO> hourEntries;
}
