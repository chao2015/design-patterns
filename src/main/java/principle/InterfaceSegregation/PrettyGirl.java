package principle.InterfaceSegregation;

/**
 * Created by chao on 2018/10/21.
 */
public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮！");
    }

    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒！");
    }

    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好！");
    }
}
