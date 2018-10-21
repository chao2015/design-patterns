package principle.InterfaceSegregation;

/**
 * Created by chao on 2018/10/21.
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IGoodBodyGirl iGoodBodyGirl) {
        super(iGoodBodyGirl);
    }

    public Searcher(IGreatTemperamentGirl iGreatTemperamentGirl) {
        super(iGreatTemperamentGirl);
    }

    public Searcher(PrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    public void show(Object o) {
        System.out.println("-----美女的信息如下：------");
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();

//        if (o instanceof PrettyGirl) {
//            super.prettyGirl.goodLooking();
//            super.prettyGirl.niceFigure();
//            super.prettyGirl.greatTemperament();
//        } else if (o instanceof IGreatTemperamentGirl) {
//            super.iGreatTemperamentGirl.greatTemperament();
//        } else if (o instanceof IGoodBodyGirl){
//            super.iGoodBodyGirl.goodLooking();
//            super.iGoodBodyGirl.niceFigure();
//        } else {
//            throw new IllegalArgumentException("Parameter Error: Require a prettyGirl,a greatTemperamentGirl or a goodBodyGirl!");
//        }

    }
}
