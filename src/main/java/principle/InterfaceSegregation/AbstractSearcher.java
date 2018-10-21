package principle.InterfaceSegregation;

/**
 * Created by chao on 2018/10/21.
 */
public abstract class AbstractSearcher {
    // 子类要使用，所以protected不同private
    protected IGoodBodyGirl iGoodBodyGirl;
    protected IGreatTemperamentGirl iGreatTemperamentGirl;
    protected PrettyGirl prettyGirl;

    public AbstractSearcher(IGoodBodyGirl iGoodBodyGirl) {
        this.iGoodBodyGirl = iGoodBodyGirl;
    }

    public AbstractSearcher(IGreatTemperamentGirl iGreatTemperamentGirl) {
        this.iGreatTemperamentGirl = iGreatTemperamentGirl;
    }

    public AbstractSearcher(PrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show(Object o);
}
