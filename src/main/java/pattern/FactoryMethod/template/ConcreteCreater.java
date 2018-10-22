package pattern.FactoryMethod.template;

/**
 * Created by chao on 2018/10/22.
 *
 * 具体工厂类
 */
public class ConcreteCreater extends Creator {
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }

        return (T)product;
    }
}
