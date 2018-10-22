package pattern.FactoryMethod.MultipleFactories;

/**
 * Created by chao on 2018/10/22.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new WhiteHuman();
    }
}
