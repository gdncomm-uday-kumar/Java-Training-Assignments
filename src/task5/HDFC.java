package task5;

public class HDFC extends Bank {
    private double fixedExtra = 5.0;

    @Override
    public double calculateCharges(double amount) {
        if (amount > 10000) {
            return getDefaultCharge() * 2 + fixedExtra;
        }
        return getDefaultCharge() + fixedExtra;
    }

    @Override
    public String getBankName() {
        return "HDFC";
    }
}
