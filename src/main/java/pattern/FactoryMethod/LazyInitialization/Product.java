package pattern.FactoryMethod.LazyInitialization;

/**
 * Created by chao on 2018/10/22.
 *
 * 抽象产品类
 */
public abstract class Product {

    // 产品类的公共方法
    public void method1() {
        // 业务逻辑处理
    }

    // 抽象方法
    public abstract void method2();
}
