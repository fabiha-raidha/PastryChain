package projectoop;

public class FleetOV {
    private String Vehiclename;
    private String Newvehicle;
    private String Brokenvehicle;

    public FleetOV() {
    }

    public FleetOV(String vehiclename, String newvehicle, String brokenvehicle) {
        Vehiclename = vehiclename;
        Newvehicle = newvehicle;
        Brokenvehicle = brokenvehicle;
    }

    public String getVehiclename() {
        return Vehiclename ;
    }

    public void setVehiclename(String vehiclename) {
        Vehiclename = vehiclename;
    }

    public String getNewvehicle() {
        return Newvehicle;
    }

    public void setNewvehicle(String newvehicle) {
        Newvehicle = newvehicle;
    }

    public String getBrokenvehicle() {
        return Brokenvehicle;
    }

    public void setBrokenvehicle(String brokenvehicle) {
        Brokenvehicle = brokenvehicle;
    }

    @Override
    public String toString() {
        return STR."FleetOV{Vehiclename='\{Vehiclename}', Newvehicle='\{Newvehicle}', Brokenvehicle='\{Brokenvehicle}'}";
    }
}
