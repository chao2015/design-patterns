package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class Snipper extends Soldier{

    private AUG aug;

    public void setGun(AUG aug) {
        this.aug = aug;
    }

    @Override
    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }

}
