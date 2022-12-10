package Rate;

public class TaxRates {
    public static double getTaxRate(int gross) {
        if (gross <= 700000) return 0.05;
        if (gross < 750000) return 0.08;
        return 0.10;
    }
}
