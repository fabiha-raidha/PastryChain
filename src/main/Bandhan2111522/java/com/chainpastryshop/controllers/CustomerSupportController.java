package com.chainpastryshop.controllers;

import com.chainpastryshop.utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CustomerSupportController {

    @FXML
    private TextArea orderStatusArea;
    @FXML
    private TextField orderIdField;

    @Deprecated
    public void respondToInquiry(ActionEvent actionEvent) {
        String inquiry = inquiryDetails.getText();
        if (!inquiry.isEmpty()) {
            // Simulate sending a response
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Response Sent");
            alert.setHeaderText("Your response has been sent.");
            alert.setContentText("Response: " + inquiry);
            alert.showAndWait();
        } else {
            System.out.println("Please enter inquiry details.");
        }

    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @Deprecated
    public void resolveOrderIssue(ActionEvent actionEvent) {
        String orderId = orderIdField.getText();
        String issue = issueDetails.getText();

        if (!orderId.isEmpty() && !issue.isEmpty()) {
            // Simulate resolving the issue
            System.out.println("Resolving issue for Order ID: " + orderId);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Issue Resolved");
            alert.setHeaderText("The issue has been resolved.");
            alert.setContentText("Order ID: " + orderId + "\nIssue: " + issue);
            alert.showAndWait();
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void processReturnExchange() {
        String orderId = orderIdReturnField.getText();
        String productName = productNameField.getText();

        if (!orderId.isEmpty() && !productName.isEmpty()) {
            // Simulate processing return/exchange
            System.out.println("Processing return/exchange for Order ID: " + orderId + " and Product: " + productName);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Return/Exchange Processed");
            alert.setHeaderText("The return/exchange has been processed.");
            alert.setContentText("Order ID: " + orderId + "\nProduct: " + productName);
            alert.showAndWait();
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void goBack() {
        SceneSwitcher.switchScene("CustomerDashboard.fxml");
    }

    @FXML
    private void goBack() {
        SceneSwitcher.switchScene("CustomerDashboard.fxml");
    }

    @Deprecated
    public void recommendProducts(ActionEvent actionEvent) {
        String productName = productInfoField.getText();
        if (!productName.isEmpty()) {
            productDetailsArea.setText("Rocommended for" + productName + "\n1.Chocolate Cake\\n2. Fruit Tart\\n3. Eclairs");
        } else {
            productDetailsArea.setText("Entry a product name to get recommendation");
        }
    }

    @Deprecated
    public void getProductInfo(ActionEvent actionEvent) {
        String productName = productInfoField.getText();
        if (!productName.isEmpty()) {
            // Simulate retrieving product information
            productDetailsArea.setText("Product Name: " + productName + "\nDetails: High-quality pastry...");
        } else {
            productDetailsArea.setText("Please enter a product name.");
    }
    }

    @Deprecated
    public void troubleshootIssue(ActionEvent actionEvent) {
        String issueDetails = technicalIssueDetails.getText();
        if (!issueDetails.isEmpty()) {
            // Simulate basic troubleshooting
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Troubleshooting");
            alert.setHeaderText("Troubleshooting Completed");
            alert.setContentText("Troubleshooting steps performed:\n1. Restart App\n2. Clear Cache\n3. Check Connection");
            alert.showAndWait();
        } else {
            System.out.println("Please describe the issue.");
        }
    }

    @Deprecated
    public void escalateIssue(ActionEvent actionEvent) {
        String issueDetails = technicalIssueDetails.getText();
        if (!issueDetails.isEmpty()) {
            // Simulate escalating the issue
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Escalation");
            alert.setHeaderText("Issue Escalated");
            alert.setContentText("The issue has been escalated to the technical team. Expect resolution soon.");
            alert.showAndWait();
        } else {
            System.out.println("Please describe the issue to escalate.");
        }
    }

    @Deprecated
    public void submitFeedback(ActionEvent actionEvent) {
        String feedback = feedbackArea.getText();
        if (!feedback.isEmpty()) {
            // Simulate submitting feedback
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Feedback Submitted");
            alert.setHeaderText("Thank you for your feedback!");
            alert.setContentText("We value your input and will use it to improve our service.");
            alert.showAndWait();
        } else {
            System.out.println("Please provide feedback before submitting.");
        }
    }

    @Deprecated
    public void escalateFeedback(ActionEvent actionEvent) {
        String feedback = feedbackArea.getText();
        if (!feedback.isEmpty()) {
            // Simulate escalating feedback
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Feedback Escalated");
            alert.setHeaderText("Your feedback has been escalated.");
            alert.setContentText("Our management team will review it and get back to you soon.");
            alert.showAndWait();
        } else {
            System.out.println("Please provide feedback to escalate.");
        }
    }

    @Deprecated
    public void resetPassword(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String email = emailField.getText();

        if (!username.isEmpty() && !email.isEmpty()) {
            // Simulate password reset
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Password Reset");
            alert.setHeaderText("Password Reset Successful");
            alert.setContentText("A password reset link has been sent to " + email + ".");
            alert.showAndWait();
        } else {
            System.out.println("Please provide both username and email.");
        }
    }

    @Deprecated
    public void updateProfile(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String email = emailField.getText();

        if (!username.isEmpty() && !email.isEmpty()) {
            // Simulate profile update
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Profile Update");
            alert.setHeaderText("Profile Updated Successfully");
            alert.setContentText("Your profile details have been updated.");
            alert.showAndWait();
        } else {
            System.out.println("Please provide both username and email.");
        }
    }

    @FXML
    public void trackOrder(ActionEvent actionEvent) {
        String orderId = orderIdField.getText();

        if (!orderId.isEmpty()) {
            // Simulate order tracking
            orderStatusArea.setText("Order ID: " + orderId + "\nStatus: In Transit\nExpected Delivery: Tomorrow");
        } else {
            orderStatusArea.setText("Please enter an Order ID to track.");
        }
    }
}