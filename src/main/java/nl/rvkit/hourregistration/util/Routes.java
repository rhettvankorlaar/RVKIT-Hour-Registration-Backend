package nl.rvkit.hourregistration.util;

public class Routes {
    public static final String API_V1 = "/v1";

    public static class HourEntry{
        public static final String HOUR_ENTRIES = API_V1 + "/hourentries";
    }
    public static class Project{
        public static final String PROJECTS = API_V1 + "/projects";
    }
    public static class Employer{
        public static final String EMPLOYERS = API_V1 + "/employers";
    }
}
