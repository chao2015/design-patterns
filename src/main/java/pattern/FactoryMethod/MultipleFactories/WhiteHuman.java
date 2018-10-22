package pattern.FactoryMethod.MultipleFactories;

/**
 * Created by chao on 2018/10/22.
 */
public class WhiteHuman implements Human {

    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    public void talk() {
        System.out.println("白色人会说话，一般都是单字节。");
    }
}
