
/**
 * Created by Станислав on 05-Dec-16.
 */
import java.util.Scanner;


public class Nkt {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Neuron neuron1 = new Neuron(new double[]{-1,-2}, new double[]{5, 10});
        Hevisaid hevisaid = new Hevisaid(neuron1.getU());
        System.out.println(hevisaid.getY());
    }
}
