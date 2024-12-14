package projectoop;

public class Budget {
    String Materials;
    int Budget;
    String Timeframe;

    public Budget(String timeframe) {
    }

    public Budget(String materials, int budget, String timeframe) {
        Materials = materials;
        Budget = budget;
        Timeframe = timeframe;
    }

    public String getMaterials() {
        return Materials;
    }

    public void setMaterials(String materials) {
        Materials = materials;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    public String getTimeframe() {
        return Timeframe;
    }

    public void setTimeframe(String timeframe) {
        Timeframe = timeframe;
    }

    @Override
    public String toString() {
        return STR."Budget{Materials='\{Materials}', Budget=\{Budget}, Timeframe='\{Timeframe}'}";
    }
}
