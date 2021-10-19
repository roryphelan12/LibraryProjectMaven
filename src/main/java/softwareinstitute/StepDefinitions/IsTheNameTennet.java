package softwareinstitute.StepDefinitions;

public class IsTheNameTennet {
    static String isItTennet(String name) {
        return "Tennet".equals(name) ? "Yes" : "No";
    }
}
