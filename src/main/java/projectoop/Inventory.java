package projectoop;

public class Inventory {
    private String products;
    private String RawMaterials;
    private int quantity;


    public Inventory(String products) {
        this.products = products;
        this.quantity = quantity;
        this.RawMaterials=RawMaterials;

    }

    public String getRawMaterials() {
        return RawMaterials;
    }

    public void setRawMaterials(String rawMaterials) {
        RawMaterials = rawMaterials;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return STR."Inventory{products='\{products}', RawMaterials='\{RawMaterials}', quantity=\{quantity}}";
    }

    public Inventory() {




    }
}

