package pattern.FactoryMethod.NvWa;

/**
 * Created by chao on 2018/10/22.
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
