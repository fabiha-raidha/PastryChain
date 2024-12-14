package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.imageio.IIOException;
import java.util.ArrayList;
import java.util.Objects;

public class Login {

    @FXML
    private TextField userIDtextfield;
    @FXML
    private TextField passwordtextfield;
    ArrayList<User> userArrayList = new ArrayList<>();
    @FXML
    private Label messageLabel;



    @FXML
    public void initialize() {
        this.userArrayList.add(new User(2511, "12345"));
        this.userArrayList.add(new User(6608, "67890"));

    }

    @FXML
    public void LoginOnActionButton(ActionEvent actionEvent) throws IIOException {
        this.messageLabel.setText("");
        int id = Integer.parseInt(this.userIDtextfield.getText());
        String password = this.passwordtextfield.getText();

        ArrayList<User> arrayList = this.userArrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            User u = arrayList.get(i);
            if (u.getUserId() == id && Objects.equals(u.getPassword(), password)) {
                this.messageLabel.setText("Login Successful");
                break;
            }

            this.messageLabel.setText("Login Unsuccessful");
        }


    }

}







