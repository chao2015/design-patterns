package pattern.FactoryMethod.SingletonFactory;

import java.lang.reflect.Constructor;

/**
 * Created by chao on 2018/10/22.
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            // 获得Singleton类
            Class c1 = Class.forName(Singleton.class.getName());
            // 获得类的无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
