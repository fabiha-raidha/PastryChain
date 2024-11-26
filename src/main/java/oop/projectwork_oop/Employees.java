package oop.projectwork_oop;

public class Employees {
    String  username, password, employeeID;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }


}
