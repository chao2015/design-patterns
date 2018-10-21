package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class Soldier {

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
