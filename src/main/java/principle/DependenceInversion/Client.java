package principle.DependenceInversion;

/**
 * Created by chao on 2018/10/21.
 * 依赖倒置原则
 * 面向接口编程
 * 在新增加底层模块如BMW时，只修改了高级模块如业务场景类如Client，对其他底层模块如Driver类不需要做任何修改
 */
public class Client {

    public static void main(String[] args) {
        IDriver chao = new Driver();
        ICar benz = new Benz();
        chao.drive(benz);
//        奔驰汽车开始运行...
        ICar bmw = new BMW();
        chao.drive(bmw);
//        宝马汽车开始运行...
    }
}
