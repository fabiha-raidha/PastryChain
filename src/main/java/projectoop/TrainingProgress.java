package projectoop;

public class TrainingProgress {
    String DriversName;
    String Attendance;

    public TrainingProgress() {
    }

    public TrainingProgress(String driversName, String attendance) {
        DriversName = driversName;
        Attendance = attendance;
    }

    public String getAttendance() {
        return Attendance;
    }

    public void setAttendance(String attendance) {
        Attendance = attendance;
    }

    public String getDriversName() {
        return DriversName;
    }

    public void setDriversName(String driversName) {
        DriversName = driversName;
    }

    @Override
    public String toString() {
        return STR."TrainingProgress{DriversName='\{DriversName}', Attendance='\{Attendance}'}";
    }
}
