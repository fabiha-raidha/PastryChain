package projectoop;

import java.time.LocalDate;

public class SupplierC {
    String UserSName;
    String Pricing;
    LocalDate Expirydates;

    public SupplierC() {
    }

    public SupplierC(String userSName, int pricing, LocalDate expirydates) {
        UserSName = userSName;
        Pricing = String.valueOf(pricing);
        Expirydates = expirydates;
    }

    public String getUserSName() {
        return UserSName;
    }

    public void setUserSName(String userSName) {
        UserSName = userSName;
    }

    public String getPricing() {
        return Pricing;
    }

    public void setPricing(String pricing) {
        Pricing = String.valueOf(pricing);
    }

    public LocalDate getExpirydates() {
        return Expirydates;
    }

    public void setExpirydates(LocalDate expirydates) {
        Expirydates = expirydates;
    }

    @Override
    public String toString() {
        return STR."SupplierC{UserSName='\{UserSName}', Pricing=\{Pricing}, Expirydates=\{Expirydates}}";
    }
}
