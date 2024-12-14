package projectoop;

public class SupplierManager {
    String Materials,pricing,NewPrice;

    public SupplierManager() {
    }

    public SupplierManager(String materials, String pricing, String newPrice) {
        Materials = materials;
        this.pricing = pricing;
        NewPrice = newPrice;
    }

    public String getMaterials() {
        return Materials;
    }

    public void setMaterials(String materials) {
        Materials = materials;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(String newPrice) {
        NewPrice = newPrice;
    }

    @Override
    public String toString() {
        return STR."SupplierManager{Materials='\{Materials}', pricing='\{pricing}', NewPrice='\{NewPrice}'}";
    }
}
