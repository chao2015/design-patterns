package pattern.FactoryMethod.LazyInitialization;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chao on 2018/10/22.
 */
public class ProductFactory {

    private static final Map<String, Product> map = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        if (map.containsKey(type)) {
            product = map.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            map.put(type, product);
        }
        return product;
    }
}
