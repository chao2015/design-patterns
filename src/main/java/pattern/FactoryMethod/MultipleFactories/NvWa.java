package pattern.FactoryMethod.MultipleFactories;

/**
 * Created by chao on 2018/10/22.
 */
public class NvWa {

    public static void main(String[] args) {
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yelloHuman = new YellowHumanFactory().createHuman();
        yelloHuman.getColor();
        yelloHuman.talk();

//        --造出的第一批人是白色人种--
//        白色人种的皮肤颜色是白色的！
//        白色人会说话，一般都是单字节。
//
//        --造出的第二批人是黑色人种--
//        黑色人种的皮肤颜色是黑色的！
//        黑人会说话，一般人听不懂。
//
//        --造出的第三批人是黄色人种--
//        黄色人种的皮肤颜色是黄色的！
//        黄色人会说话，一般说的都是双字节。
    }
}
