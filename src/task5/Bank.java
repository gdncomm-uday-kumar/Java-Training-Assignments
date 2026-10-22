package task5;

public class Bank {
    private double defaultCharge = 10.0;

    protected double getDefaultCharge() {
        return defaultCharge;
    }

    public double calculateCharges(double amount) {
        return defaultCharge;
    }

    public String getBankName() {
        return "Bank";
    }
}
