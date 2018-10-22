package pattern.FactoryMethod.template;

/**
 * Created by chao on 2018/10/22.
 *
 * 抽象工厂类
 */
public abstract class Creator {

    // 创建一个产品对象，其输入参数类型可以自行设置，也可以为空
    // 在函数中使用泛型，<T extends Product>是声明泛型类型，T是函数返回值
    // 通过Class<T>来加载泛型的Class对象，形如ConcreteProduct1.class
    // a.getClass()==A.class
    public abstract <T extends Product> T createProduct(Class<T> c);
}
