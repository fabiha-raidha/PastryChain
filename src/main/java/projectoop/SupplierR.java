package projectoop;

public class SupplierR {
    private String Supplierlist;
    private String Report;

    public SupplierR() {
    }

    public SupplierR(String supplierlist, String report) {
        Supplierlist = supplierlist;
        Report = report;
    }

    public String getSupplierlist() {
        return Supplierlist;
    }

    public void setSupplierlist(String supplierlist) {
        Supplierlist = supplierlist;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    @Override
    public String toString() {
        return STR."SupplierR{Supplierlist='\{Supplierlist}', Report='\{Report}'}";
    }
}
