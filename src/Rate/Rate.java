package Rate;

import Worker.Worker;

public class Rate {
    private int gross;
    private double tax;
    Rate (int gross, double tax) {
        this.gross = gross;
        this.tax = tax;
    }
    public static Rate getRate(Worker worker) {
        int gross = getGross(HoBongRates.findById(worker.getHoBong()));
        double tax = getTax(gross);

        return new Rate(gross, tax);
    }

    public static int getGross(HoBongRates hoBongRates) {
        return hoBongRates.getGross();
    }

    public static double getTax(int gross) {
        return TaxRates.getTaxRate(gross);
    }
}
