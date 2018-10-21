package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射...");
    }
}
