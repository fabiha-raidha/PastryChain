package ProjectOop;

public class User {

    private int UserId;
    private String password;

    public User(int userId, String password) {
        UserId = userId;
        this.password = password;
    }

    public int getUserId() { return UserId;
    }

    public void setUserId(int userId) { UserId = userId;
    }

    public String getPassword() { return password;
    }

    public void setPassword(String password) {this.password = password;
    }

    @Override
    public String toString() {return "User{" + "username='" + UserId + '\'' + ", password='" + password + '\'' + '}';
    }
}

