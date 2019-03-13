package design.pattern.factory.method.idcard;

import design.pattern.factory.method.framework.Product;
import design.pattern.factory.method.model.Account;

public class IDCard extends Product {

    private Account account = new Account();

    public IDCard(String name){
        account.setName(name);
        account.setBalance(0);
    }

    @Override
    public void recharge(double x) {
        account.setBalance(account.getBalance() + x);
        System.out.println(String.format("向 %s 的账户充值 %d 元，余额：%d元", account.getName(), (int)x, (int)account.getBalance()));
    }

    @Override
    public void use(double x) {
        account.setBalance(account.getBalance() - x);
        System.out.println(String.format("从 %s 的账户消费 %d 元，余额：%d元", account.getName(), (int)x, (int)account.getBalance()));
    }

    public String getOwner() {
        return account.getName();
    }
}
