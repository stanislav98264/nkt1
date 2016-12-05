
/**
 * Created by Станислав on 05-Dec-16.
 */


public class Neuron {
    private double[] x;
    private double[] w;

    public Neuron(double[] x, double[] w) {
        this.x = x;
        this.w = w;

    }

    public double getU() {
        double U = 0;
        for (int i = 0; i < x.length; i++) {
            U += x[i] * w[i];
        }
        return U;
    }
}
