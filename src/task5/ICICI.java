package task5;

public class ICICI extends Bank {
    private double extraPercent = 0.5;

    @Override
    public double calculateCharges(double amount) {
        return getDefaultCharge() + (amount * extraPercent / 100);
    }

    @Override
    public String getBankName() {
        return "ICICI";
    }
}
