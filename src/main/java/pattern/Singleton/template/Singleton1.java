package pattern.Singleton.template;

/**
 * Created by chao on 2018/10/22.
 *
 * 饿汉式
 */
public class Singleton1 {

    public static final Singleton1 singleton = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getSingleton() {
        return singleton;
    }

    public void doSomething(){}
}
