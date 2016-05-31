package org.design.pattern.facade.model;

/**
 * <p>
 * 投资项目的外观：基金
 * </p>
 * Create Date: 2016年5月31日
 * Last Modify: 2016年5月31日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class FundFacade {

    private StockA stockA = null;
    private StockB stockB = null;
    private NationalDebt debt = null;
    private RealEstate estate = null;
    
    public FundFacade() {
        stockA = new StockA();
        stockB = new StockB();
        debt = new NationalDebt();
        estate = new RealEstate();
    }
    
    public void buyAll(int count) {
        stockA.buy(count);
        stockB.buy(count);
        debt.buy(count);
        estate.buy(count);
    }
    
    public void sellAll(int count) {
        stockA.sell(count);
        stockB.sell(count);
        debt.sell(count);
        estate.sell(count);
    }
    
    public void buyStockA(int count) {
        stockA.buy(count);
    }
    
    public void sellNationalDebt(int count) {
        debt.sell(count);
    }
}
