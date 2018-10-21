package principle.LawOfDemeter.CountOff;

import java.util.List;

/**
 * Created by chao on 2018/10/21.
 */
public class GroupLeader {

    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    public void countGirls() {
        System.out.println("女生数量是：" + this.listGirls.size());
    }
}
