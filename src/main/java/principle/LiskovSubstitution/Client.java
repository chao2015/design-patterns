package principle.LiskovSubstitution;

/**
 * Created by chao on 2018/10/21.
 */
public class Client {

    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        sanMao.setGun(new Rifile());
        sanMao.killEnemy();
//        士兵开始杀敌人...
//        步枪射击...

        Snipper siMao = new Snipper();
        siMao.setGun(new AUG());
        siMao.killEnemy();
//        通过望远镜察看敌人...
//        AUG射击...
    }
}
