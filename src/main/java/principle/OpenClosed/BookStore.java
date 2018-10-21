package principle.OpenClosed;

import java.util.ArrayList;

/**
 * Created by chao on 2018/10/21.
 */
public class BookStore {

    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    private final static ArrayList<IBook> offBookList = new ArrayList<IBook>();

    static {
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
        bookList.add(new NovelBook("悲惨世界", 3500, "雨果"));
        bookList.add(new NovelBook("金瓶梅", 4300, "兰陵笑笑生"));
        bookList.add(new ComputerBook("Think in Java", 4300, "Bruce Eckel", "编程语言"));
    }

    static {
        offBookList.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        offBookList.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
        offBookList.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
        offBookList.add(new OffNovelBook("金瓶梅", 4300, "兰陵笑笑生"));
    }


    public static ArrayList<IBook> getBookList() {
        return bookList;
    }

    public static ArrayList<IBook> getOffBookList() {
        return offBookList;
    }
}
