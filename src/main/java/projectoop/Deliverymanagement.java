package projectoop;

public class Deliverymanagement {
    String DriverName;
    String OrderCode;

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }

    @Override
    public String toString() {
        return STR."Deliverymanagement{DriverName='\{DriverName}', OrderCode='\{OrderCode}'}";
    }

    public Deliverymanagement(String driverName, String orderCode) {
        DriverName = driverName;
        OrderCode = orderCode;
        
        
    }

   
}
