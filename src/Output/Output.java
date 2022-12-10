package Output;

import Worker.Worker;

public class Output {
    public static void output(Worker worker) {
        System.out.println(String.format("%4s", worker.getName()) + "    " + worker.getHoBong() + "     "
                + String.format("%7d", worker.getSuDang()) + "    " + String.format("%6d", worker.getGross()) + "     "
                + String.format("%5d", worker.getTax()) + "    " + String.format("%7d", worker.getNet())
        );
    }

    public static void output(Worker[] workers) {
        System.out.println(" NAME  HO-BONG  SU-DANG    GROSS       TAX       NET");

        for (int i = 0; i < workers.length; i++) {
            Output.output(workers[i]);
        }

        Total.output(workers);
    }
}
