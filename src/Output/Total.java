package Output;

import Compute.Compute;
import Worker.Worker;

public class Total {
    private int suDang;
    private int gross;
    private int tax;
    private int net;

    public Total () {}
    public int getSuDang() {
        return suDang;
    }

    public int getGross() {
        return gross;
    }

    public int getTax() {
        return tax;
    }

    public int getNet() {
        return net;
    }

    public void setSuDang(int suDang) {
        this.suDang = suDang;
    }

    public void setGross(int gross) {
        this.gross = gross;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setNet(int net) {
        this.net = net;
    }
    public void set(int suDang, int gross, int tax, int net) {
        this.setSuDang(suDang);
        this.setGross(gross);
        this.setTax(tax);
        this.setNet(net);
    }

    public static void output(Worker[] workers) {
        Total total = Compute.computeTotal(workers);

        System.out.println("TOTAL          " + String.format("%8d", total.getSuDang())
                + "   " + String.format("%7d", total.getGross()) + "    " + String.format("%6d", total.getTax())
                + "   " + String.format("%8d", total.getNet())
        );
    }
}
