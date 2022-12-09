package Compute;

import Output.Total;
import Rate.Rate;
import Worker.Worker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Compute {
    public static Worker computeWorker(Worker worker) {
        Rate rate = Rate.getRate(worker);
        worker.setGross(rate.getGross());
        worker.setTax((int) Math.floor(worker.getGross() * rate.getTax() / 100) * 100);
        worker.setNet(worker.getGross() + worker.getSuDang() - worker.getTax());

        return worker;
    }

    public static Worker[] computeWorker(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            Compute.computeWorker(workers[i]);
        }

        workers = Compute.sortByNet(workers);
        return workers;
    }

    public static Worker[] sortByNet(Worker[] workers) {
        Arrays.sort(workers, Comparator.comparing(Worker::getNet));
        Collections.reverse(Arrays.asList(workers));

        return workers;
    }

    public static Total computeTotal(Worker[] workers) {
        Total total = new Total();

        int suDangTotal = 0, grossTotal = 0, taxTotal = 0, netTotal = 0;
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];

            suDangTotal += worker.getSuDang();
            grossTotal += worker.getGross();
            taxTotal += worker.getTax();
            netTotal += worker.getNet();
        }

        total.set(suDangTotal, grossTotal, taxTotal, netTotal);

        return total;
    }
}
