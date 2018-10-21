package principle.LawOfDemeter.CountOff;

/**
 * Created by chao on 2018/10/21.
 */
public class Teacher {
    public void command(GroupLeader groupLeader) {
        groupLeader.countGirls();
    }
}
