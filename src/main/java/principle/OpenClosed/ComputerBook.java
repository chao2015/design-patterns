package principle.OpenClosed;

/**
 * Created by chao on 2018/10/21.
 */
public class ComputerBook implements IComputerBook {

    private String name;
    private String scope;
    private String author;
    private int price;

    public ComputerBook (String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getScope() {
        return this.scope;
    }
}
