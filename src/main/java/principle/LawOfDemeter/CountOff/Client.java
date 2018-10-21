package principle.LawOfDemeter.CountOff;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2018/10/21.
 */
public class Client {

    public static void main(String[] args) {
        List<Girl> listGirls = new ArrayList<Girl>();
        for (int i=0; i<20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(listGirls));
//        女生数量是：20
    }
}
