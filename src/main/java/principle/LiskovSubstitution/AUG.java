package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class AUG extends Rifile {

    public void zoomOut() {
        System.out.println("通过望远镜察看敌人...");
    }

    public void shoot() {
        System.out.println("AUG射击...");
    }
}
