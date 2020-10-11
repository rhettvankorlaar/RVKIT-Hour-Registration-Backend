package nl.rvkit.hourregistration.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import nl.rvkit.hourregistration.employer.Employer;
import nl.rvkit.hourregistration.hourentry.HourEntry;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @Column(nullable = false)
    private String name;
    @NonNull
    @Column(nullable = false)
    private String authId;
    private double rate;
    private boolean isDayRate;
    @NonNull
    @ManyToOne
    private Employer employer;
    @OneToMany
    private List<HourEntry> hourEntries;
}
