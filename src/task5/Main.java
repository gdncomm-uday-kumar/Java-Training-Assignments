package task5;

public class Main {
    public static void main(String[] args) {
        Bank[] banks = {new Bank(), new ICICI(), new HDFC()};
        double[] amounts = {5000, 20000};

        for (int i = 0; i < banks.length; i++) {
            for (int j = 0; j < amounts.length; j++) {
                double charge = banks[i].calculateCharges(amounts[j]);
                System.out.println(banks[i].getBankName() + " charge for " + "amount: " + amounts[j] + " = " + charge + "rupees");
            }
        }
    }
}
