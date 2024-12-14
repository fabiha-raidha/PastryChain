package projectoop;

public class Reroute {
    private  String CurrentRoute;
    private  String OtherRoute;

    public Reroute() {
    }

    public Reroute(String currentRoute, String otherRoute) {
        CurrentRoute = currentRoute;
        OtherRoute = otherRoute;
    }

    public String getCurrentRoute() {
        return CurrentRoute;
    }

    public void setCurrentRoute(String currentRoute) {
        CurrentRoute = currentRoute;
    }

    public String getOtherRoute() {
        return OtherRoute;
    }

    public void setOtherRoute(String otherRoute) {
        OtherRoute = otherRoute;
    }

    @Override
    public String toString() {
        return STR."Reroutemodelclass{CurrentRoute='\{CurrentRoute}', OtherRoute='\{OtherRoute}'}";
    }
}
