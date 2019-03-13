package design.pattern.template;

public class CharDisplay extends AbstractDisplay {
    private char _ch;

    public CharDisplay(char ch){
        this._ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this._ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}