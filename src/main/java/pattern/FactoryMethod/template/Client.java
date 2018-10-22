package pattern.FactoryMethod.template;

/**
 * Created by chao on 2018/10/22.
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreater();
        Product product = creator.createProduct(ConcreteProduct1.class);
        // 处理业务
    }
}
