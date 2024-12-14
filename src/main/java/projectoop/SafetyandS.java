package projectoop;

public class SafetyandS {
    private String Drivers;
    private String Rules;

    public SafetyandS() {
    }

    public SafetyandS(String drivers, String rules) {
        Drivers = drivers;
        Rules = rules;
    }

    public String getDrivers() {
        return Drivers;
    }

    public void setDrivers(String driver) {
        Drivers = driver;
    }

    public String getRules() {
        return Rules;
    }

    public void setRules(String rules) {
        Rules = rules;
    }

    @Override
    public String toString() {
        return STR."SafetyandS{Driver='\{Drivers}', Rules='\{Rules}'}";
    }
}
