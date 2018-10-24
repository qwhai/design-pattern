package template;

public class CharDisplay extends AbstractDisplay {
    private char _ch;

    public CharDisplay(char ch){
        this._ch = ch;
    }

    @Override
    public void open() {
        // TODO
        System.out.print("<<");
    }

    @Override
    public void print() {
        // TODO
        System.out.print(this._ch);
    }

    @Override
    public void close() {
        // TODO
        System.out.println(">>");
    }
}
