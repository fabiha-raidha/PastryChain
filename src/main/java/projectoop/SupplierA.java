package projectoop;

import java.time.LocalDate;

public class SupplierA {
    private String Suppliername;
    private LocalDate Auditdate;

    public SupplierA(String suppliername, String supplierlist) {
        Suppliername = suppliername;
        Auditdate = auditdate;
    }

    public String getSuppliername() {
        return Suppliername;
    }

    public void setSuppliername(String suppliername) {
        Suppliername = suppliername;
    }


    public LocalDate getAuditdate() {
        return Auditdate;
    }

    public void setAuditdate(LocalDate auditdate) {
        Auditdate = auditdate;
    }

    @Override
    public String toString() {
        return STR."SupplierA{Suppliername='\{Suppliername}', Auditdate=\{Auditdate}}";
    }
}

