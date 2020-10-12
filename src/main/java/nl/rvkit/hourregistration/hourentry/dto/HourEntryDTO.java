package nl.rvkit.hourregistration.hourentry.dto;


import nl.rvkit.hourregistration.project.dto.ProjectDTO;

import java.util.Date;

public class HourEntryDTO {
    private long id;
    private String authId;
    private Date startDateTime;
    private Date endDateTime;
    private String description;
    private int travelDistanceInKM;
    private boolean invoiced;
    private ProjectDTO project;
}
