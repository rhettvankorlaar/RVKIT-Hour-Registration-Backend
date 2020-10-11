package nl.rvkit.hourregistration.hourentry;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HourEntryController {
    private final IHourEntryService hourEntryService;

    public HourEntryController(IHourEntryService hourEntryService) {
        this.hourEntryService = hourEntryService;
    }
}
