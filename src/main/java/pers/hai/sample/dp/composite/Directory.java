package pers.hai.sample.dp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-30 09:44
 * Last Modify: 2019-05-30
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    @Override
    protected void printList(String prefix) {
        System.out.println(String.format("%s/%s", prefix, this));
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(String.format("%s/%s", prefix, this));
        }
    }
}
