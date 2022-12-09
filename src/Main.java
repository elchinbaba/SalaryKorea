import Compute.Compute;
import Input.Input;
import Output.Output;
import Worker.Worker;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = Worker.convertInputToWorker(Input.WORKERS);

        Compute.computeWorker(workers);

        Output.output(workers);
    }
}