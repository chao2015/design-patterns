package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class Handgun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
