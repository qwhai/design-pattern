package template;

public class Main {
    public static void main(String[] args){
        // TEST 1
        AbstractDisplay d1 = new CharDisplay('A');
        d1.display();

        // TEST 2
        AbstractDisplay d2 = new StringDisplay("Hello, World");
        d2.display();
    }
}
