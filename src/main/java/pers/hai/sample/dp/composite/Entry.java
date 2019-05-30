package pers.hai.sample.dp.composite;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-30 09:39
 * Last Modify: 2019-05-30
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return String.format("%s (%d)", getName(), getSize());
    }
}
