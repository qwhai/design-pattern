package org.design.pattern.facade.model;

/**
 * <p>
 * 股票 A
 * </p>
 * Create Date: 2016年5月31日
 * Last Modify: 2016年5月31日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.2
 */
class StockA {

    private int stockCount = 0;
    
    void sell(int count){
        stockCount -= count;
        System.out.println("卖了" + count + "支 A 股票");
    }
    
    void buy(int count){
        stockCount += count;
        System.out.println("买了" + count + "支 A 股票");
    }
    
    int getStockCount() {
        return stockCount;
    }
}
