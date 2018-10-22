package pattern.Singleton.EmperorAndMinister;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by chao on 2018/10/22.
 *
 * 有上限的多例模式
 */
public class Emperor {

    private Emperor() {}

    private Emperor(String name) {
        nameList.add(name);
    }

    private static int maxNumOfEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<String>();

    private static ArrayList<Emperor> emperolist = new ArrayList<Emperor>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i=0; i<maxNumOfEmperor; i++) {
            emperolist.add(new Emperor("皇" + (i+1) + "帝"));
        }
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperolist.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
