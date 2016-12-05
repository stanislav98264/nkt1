
/**
 * Created by Станислав on 05-Dec-16.
 */
public class Hevisaid {
    private double u;

    public Hevisaid(double u){
        this.u= u;
    }
    public int getY(){
        int y = 0;
        if(u >= 0){
            y = 1;
        }
        return y;
    }
}


