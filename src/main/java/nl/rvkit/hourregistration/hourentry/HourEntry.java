package nl.rvkit.hourregistration.hourentry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import nl.rvkit.hourregistration.project.Project;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class HourEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @Column(nullable = false)
    private String authId;
    @NonNull
    @Column(nullable = false)
    private Date startDateTime;
    @NonNull
    @Column(nullable = false)
    private Date endDateTime;
    private String description;
    private int travelDistanceInKM;
    private boolean invoiced;
    @NonNull
    @ManyToOne
    private Project project;
}
