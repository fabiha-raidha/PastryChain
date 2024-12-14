package projectoop;

public class CustomerS {
    private String Complaints;

    public CustomerS(String complaints) {
        Complaints = complaints;
    }

    public String getComplaints() {
        return Complaints;
    }

    public void setComplaints(String complaints) {
        Complaints = complaints;
    }

    @Override
    public String toString() {
        return STR."CustomerS{Complaints='\{Complaints}'}";
    }
}
