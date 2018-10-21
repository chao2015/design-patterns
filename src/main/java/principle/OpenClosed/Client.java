package principle.OpenClosed;

import java.text.NumberFormat;

/**
 * Created by chao on 2018/10/21.
 */
public class Client {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();  // 格式化输出货币的实例
        formatter.setMaximumFractionDigits(2);  // 设置数值的小数部分允许的最大位数
        System.out.println("-----书店卖出去的书籍记录如下：-----");
        for (IBook book: BookStore.getBookList()) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" + book.getAuthor()
                    + "\t书籍价格：" + formatter.format(book.getPrice()/100.0) + "元");
        }
//        -----书店卖出去的书籍记录如下：-----
//        书籍名称：天龙八部	书籍作者：金庸	书籍价格：CNY32.00元
//        书籍名称：巴黎圣母院	书籍作者：雨果	书籍价格：CNY56.00元
//        书籍名称：悲惨世界	书籍作者：雨果	书籍价格：CNY35.00元
//        书籍名称：金瓶梅	书籍作者：兰陵笑笑生	书籍价格：CNY43.00元
//        书籍名称：Think in Java	书籍作者：Bruce Eckel	书籍价格：CNY43.00元

        System.out.println("-----书店卖出去的书籍记录如下：-----");
        for (IBook book: BookStore.getOffBookList()) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" + book.getAuthor()
                    + "\t书籍价格：" + formatter.format(book.getPrice()/100.0) + "元");
        }
//        -----书店卖出去的书籍记录如下：-----
//        书籍名称：天龙八部	书籍作者：金庸	书籍价格：CNY25.60元
//        书籍名称：巴黎圣母院	书籍作者：雨果	书籍价格：CNY50.40元
//        书籍名称：悲惨世界	书籍作者：雨果	书籍价格：CNY28.00元
//        书籍名称：金瓶梅	书籍作者：兰陵笑笑生	书籍价格：CNY38.70元
    }
}
