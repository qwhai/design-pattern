package memento;

public class Main {
    public static void main(String[] args) {
        Gamer g = new Gamer(100);
        Memento m = g.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("第 " + i + " 局");
            System.out.println("当前状态: " + g);

            g.bet();

            System.out.println("所持金钱为: " + g.getMoney() + "元");

            if (g.getMoney() > m.getMoney()){
                System.out.println("所持金钱增加了，保存当前状态");
                m = g.createMemento();
            } else if (g.getMoney() < m.getMoney() / 2) {
                System.out.println("所持金钱大幅减少，恢复至以前状态");
                g.restoreMemento(m);
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println("");
        }
    }
}
