package principle.SingleResponsibility;

/**
 * Created by chao on 2018/10/21.
 *
 * 符合单一职责原则的电话类
 */
public class Phone implements IConnectionManager, IDataTransfer {
    public void DataTransfer(IConnectionManager cm) {

    }

    public void dial(String phoneNumber) {

    }

    public void hangup() {

    }
}
