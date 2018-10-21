package principle.DependenceInversion;

/**
 * Created by chao on 2018/10/21.
 *
 *
 */
public class Driver implements IDriver {
    public void drive(ICar car) {
        car.run();
    }
}
