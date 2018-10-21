package principle.LawOfDemeter.Install;

import java.util.Random;

/**
 * Created by chao on 2018/10/21.
 */
public class Wizard {

    private Random rand = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    private int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    private int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }

    public void installWizard() {
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }
}
