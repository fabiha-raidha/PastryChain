package projectoop;

import java.time.LocalDate;

public class TrainingSchedule {
    String Driver;
    LocalDate Date;

    public TrainingSchedule(String driver, LocalDate date) {
        Driver = driver;
        Date = date;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return STR."TrainingSchedule{Driver='\{Driver}', Date=\{Date}}";
    }
}
