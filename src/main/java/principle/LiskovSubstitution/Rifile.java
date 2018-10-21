package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class Rifile extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
