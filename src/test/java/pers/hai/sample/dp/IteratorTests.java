package pers.hai.sample.dp;

import pers.hai.sample.dp.iterator.Book;
import pers.hai.sample.dp.iterator.BookShelf;
import pers.hai.sample.dp.iterator.Iterator;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 16:38
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class IteratorTests extends Testable {

    @Test
    public void test1() {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java 编程思想"));
        bookShelf.appendBook(new Book("深入理解 Java 虚拟机"));
        bookShelf.appendBook(new Book("Java 核心技术·卷I：基础知识"));
        bookShelf.appendBook(new Book("Java 核心技术·卷II: 高级特性"));
        bookShelf.appendBook(new Book("Effective Java"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            logger.info(iterator.next());
        }
    }
}
