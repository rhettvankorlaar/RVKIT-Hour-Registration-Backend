package nl.rvkit.hourregistration.employer;

import nl.rvkit.hourregistration.employer.dto.EmployerDTO;
import nl.rvkit.hourregistration.util.Response;
import nl.rvkit.hourregistration.util.Routes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployerController {
    private final IEmployerService employerService;

    public EmployerController(IEmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(Routes.Employer.EMPLOYERS)
    @ResponseStatus(HttpStatus.OK)
    public Response<EmployerDTO> createEmployer(){
return null;
    }


}
