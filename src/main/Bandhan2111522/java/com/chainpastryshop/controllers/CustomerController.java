package com.chainpastryshop.controllers;

import com.chainpastryshop.utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import com.chainpastryshop.services.OrderService;
import com.chainpastryshop.models.Order;
import com.chainpastryshop.services.AuthService;
import com.chainpastryshop.models.Product;
import com.chainpastryshop.services.ProductService;
import com.chainpastryshop.services.CartService;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.List;

public class CustomerController {
    @FXML private ListView<String> orderHistoryListView;

    private final OrderService orderService = new OrderService();

    @FXML
    private void initialize() {
        // Populate order history
        orderHistoryListView.getItems().clear();
        orderService.getOrderHistory().forEach(order -> orderHistoryListView.getItems().add("Order #" + order.getOrderId() + " - " + order.getStatus()));
    }

    @FXML
    private void trackOrder() {
        String selectedOrder = orderHistoryListView.getSelectionModel().getSelectedItem();
        if (selectedOrder != null) {
            int orderId = Integer.parseInt(selectedOrder.split(" ")[1].substring(1));  // Extract Order ID from the label text
            Order order = orderService.getOrderById(orderId);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Order Tracking");
            alert.setHeaderText("Tracking Status for Order #" + order.getOrderId());
            alert.setContentText("Order Status: " + order.getStatus() + "\nEstimated Delivery: " + order.getEstimatedDelivery());
            alert.showAndWait();
        }
    }

    @FXML
    private void goBack() {
        // Go back to previous screen (e.g., home screen)
        SceneSwitcher.switchScene("ExploreCollections.fxml");
    }
}
    private final ProductService productService = new ProductService();
    private final CartService cartService = new CartService();
    private final ProductService productService = new ProductService();

    @FXML
    private void initialize() {
        // Populate cart with items
        cartListView.getItems().clear();
        cartService.getCartItems().forEach(item -> cartListView.getItems().add(item.getName() + " - $" + item.getPrice()));

        // Display total price
        totalPriceLabel.setText("Total: $" + cartService.getTotalPrice());
    }

    @FXML
    private void applyVoucher() {
        String voucherCode = voucherField.getText();
        if (voucherCode != null && !voucherCode.isEmpty()) {
            double discount = cartService.applyVoucher(voucherCode);
            if (discount > 0) {
                totalPriceLabel.setText("Total after discount: $" + (cartService.getTotalPrice() - discount));
                System.out.println("Voucher applied. Discount: $" + discount);
            } else {
                System.out.println("Invalid voucher code.");
            }
        } else {
            System.out.println("Please enter a voucher code.");
        }
    }

    @FXML
    private void proceedToCheckout() {
        // Proceed to checkout screen (checkout logic can be added here)
        SceneSwitcher.switchScene("Checkout.fxml");
    }

    @FXML
    private void goBack() {
        // Go back to previous screen
        SceneSwitcher.switchScene("ExploreCollections.fxml");
    }




    @FXML
    public void initialize() {
        // Load the selected product details
        Product selectedProduct = productService.getSelectedProduct();
        if (selectedProduct != null) {
            productNameLabel.setText(selectedProduct.getName());
            productCategoryLabel.setText("Category: Cakes, Pastries, Cookies,Breads " + selectedProduct.getCategory());
            productPriceLabel.setText("Price: ." + selectedProduct.getPrice());
            productDescriptionLabel.setText("Description: A delicious " + selectedProduct.getCategory().toLowerCase() + " made with high-quality ingredients.");
        }
    }

    @FXML
    private void addToCart() {
        // Add the product to the cart (cart logic can be added here)
        System.out.println(productService.getSelectedProduct().getName() + " added to the cart!");
        // Redirect to cart or home after adding the item to cart
    }

    @FXML
    private void goBack() {
        // Go back to the previous screen (e.g., product listing or search results)
        SceneSwitcher.switchScene("ExploreCollections.fxml");


        @Deprecated
        public void handleRegister (ActionEvent.actionEvent) {
                String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (authService.register(username, email, password, confirmPassword)) {
            SceneSwitcher.switchScene("Register.fxml");
        } else {
            System.out.println("Registration failed. Please check your input.");
        }
    }

        @javafx.fxml.FXML
        public void goBack (ActionEvent actionEvent){
            SceneSwitcher.switchScene("Register.fxml");
        }

        @Deprecated
        public void viewProductDetails (ActionEvent actionEvent){
            String selectedProduct = (String) productListView.getSelectionModel().getSelectedItem();
            if (selectedProduct != null) {
                // Store selected product info for the next screen
                productService.setSelectedProduct(selectedProduct);
                SceneSwitcher.switchScene("ViewProductDetails.fxml");
            } else {
                System.out.println("No product selected!");
            }
        }
        private final ProductService productService = new ProductService();
        @FXML
        public void initialize () {
            categoryComboBox.getItems().addAll("Cake", "Pastries", "Cookies", "Breads");
        }


        @Deprecated
        public void handleCategorySelection (ActionEvent actionEvent){
            String selectedCategory = (String) categoryComboBox.getValue();
            if (selectedCategory != null) {
                List<Product> products = productService.getProductsByCategory(selectedCategory);
                productListView.getItems().clear();
                for (Product product : products) {
                    productListView.getItems().add(product.getName() + " - $" + product.getPrice());
                }
            }
        }
        @FXML
        private void goBack () {
            SceneSwitcher.switchScene("Register.fxml");
        }
        private final ProductService productService = new ProductService();

        @FXML
        private void handleSearch () {
            String keyword = searchField.getText();
            if (keyword != null && !keyword.isEmpty()) {
                List<Product> searchResults = productService.searchProducts(keyword);
                searchResultsListView.getItems().clear();
                for (Product product : searchResults) {
                    searchResultsListView.getItems().add(product.getName() + " - $" + product.getPrice());
                }
            } else {
                System.out.println("Please enter a keyword to search.");
            }
        }

        @FXML
        private void viewProductDetails () {
            String selectedProduct = searchResultsListView.getSelectionModel().getSelectedItem().toString();
            if (selectedProduct != null) {
                productService.setSelectedProduct(selectedProduct);
                SceneSwitcher.switchScene("ViewProductDetails.fxml");
            } else {
                System.out.println("No product selected!");
            }
        }
        @FXML private TextField nameField;
        @FXML private TextField addressField;
        @FXML private TextField phoneField;

        @FXML
        private void saveProfile() {
            String name = nameField.getText();
            String address = addressField.getText();
            String phone = phoneField.getText();

            if (!name.isEmpty() && !address.isEmpty() && !phone.isEmpty()) {
                // Save the profile (for demonstration, just print the data)
                System.out.println("Profile updated:\nName: " + name + "\nAddress: " + address + "\nPhone: " + phone);
            } else {
                System.out.println("Please fill in all fields.");
            }
        }

        @FXML
        private void goBack() {
            SceneSwitcher.switchScene("ExploreCollections.fxml");
        }

        @FXML private ComboBox<String> paymentMethodCombo;

        @FXML
        private void completePurchase() {
            String paymentMethod = paymentMethodCombo.getValue();
            if (paymentMethod != null) {
                // Simulate completing the purchase
                System.out.println("Purchase completed with " + paymentMethod);
                // Transition to confirmation screen or next step
                SceneSwitcher.switchScene("OrderConfirmation.fxml");
            } else {
                System.out.println("Please select a payment method.");
            }
        }

        @FXML
        private void goBack() {
            SceneSwitcher.switchScene("AddToCart.fxml");
        }
        @FXML
        private void goBack() {
            SceneSwitcher.switchScene("ExploreCollections.fxml");
        }


    }