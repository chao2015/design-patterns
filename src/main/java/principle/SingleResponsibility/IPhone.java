package principle.SingleResponsibility;

/**
 * Created by chao on 2018/10/21.
 *
 * 不符合单一职责原则的接口
 */
public interface IPhone {

    public void dial(String phoneNumber);

    public void chat(Object o);

    public void hangup();
}
