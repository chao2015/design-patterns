package pattern.FactoryMethod.NvWa;

/**
 * Created by chao on 2018/10/22.
 */
public class YelloHuman implements Human{

    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人会说话，一般说的都是双字节。");
    }
}
