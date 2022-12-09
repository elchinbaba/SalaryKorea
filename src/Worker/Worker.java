package Worker;

public class Worker {
    private String name;
    private int hoBong;
    private int suDang;
    private int gross;
    private int tax;
    private int net;

    Worker (String name, int hoBong, int suDang) {
        this.name = name;
        this.hoBong = hoBong;
        this.suDang = suDang;
    }

    public String getName() {
        return name;
    }

    public int getHoBong() {
        return hoBong;
    }

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

    public void setGross(int gross) {
        this.gross = gross;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public static Worker convertInputToWorker(String[] input) {
        String name = input[0];
        int hoBong = Integer.parseInt(input[1]);
        int suDang = Integer.parseInt(input[2]);

        return new Worker(name, hoBong, suDang);
    }

    public static Worker[] convertInputToWorker(String[][] input) {
        Worker[] workers = new Worker[input.length];
        for (int i = 0; i < input.length; i++) {
            workers[i] = convertInputToWorker(input[i]);
        }

        return workers;
    }
}
