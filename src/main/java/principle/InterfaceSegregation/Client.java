package principle.InterfaceSegregation;

/**
 * Created by chao on 2018/10/21.
 *
 * Search类中的show()方法其实还有问题
 */
public class Client {

    public static void main(String[] args) {
        PrettyGirl xinxin = new PrettyGirl("xinxin");
        AbstractSearcher searcher = new Searcher(xinxin);
        searcher.show(xinxin);
//        -----美女的信息如下：------
//        xinxin---脸蛋很漂亮！
//        xinxin---身材非常棒！
//        xinxin---气质非常好！
    }
}
