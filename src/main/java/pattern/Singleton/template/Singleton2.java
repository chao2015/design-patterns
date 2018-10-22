package pattern.Singleton.template;

/**
 * Created by chao on 2018/10/22.
 *
 * 懒汉式
 */
public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2() {}

    public static Singleton2 getSingleton() {
        if (singleton == null)
            singleton = new Singleton2();
        return singleton;
    }
}
