package principle.SingleResponsibility;

/**
 * Created by chao on 2018/10/21.
 */
public interface IConnectionManager {

    public void dial(String phoneNumber);

    public void hangup();
}
