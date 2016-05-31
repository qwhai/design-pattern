package org.design.pattern.facade.model;

/**
 * <p>
 * 国债
 * </p>
 * Create Date: 2016年5月31日
 * Last Modify: 2016年5月31日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.2
 */
class NationalDebt {

    private int debtCount = 0;
    
    void sell(int count){
        debtCount -= count;
        System.out.println("卖了" + count + "支国债");
    }
    
    void buy(int count){
        debtCount += count;
        System.out.println("买了" + count + "支国债");
    }
    
    int getDebtCount() {
        return debtCount;
    }
}
