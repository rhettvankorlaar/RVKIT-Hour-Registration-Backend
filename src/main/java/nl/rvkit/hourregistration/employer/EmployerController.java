package nl.rvkit.hourregistration.employer;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployerController {
    private final IEmployerService employerService;

    public EmployerController(IEmployerService employerService) {
        this.employerService = employerService;
    }
}
