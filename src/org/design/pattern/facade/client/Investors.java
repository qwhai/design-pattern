package org.design.pattern.facade.client;

import org.design.pattern.facade.model.FundFacade;

/**
 * <p>
 * 投资者
 * </p>
 * Create Date: 2016年5月31日
 * Last Modify: 2016年5月31日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class Investors {

    public static void main(String[] args) {
        FundFacade facade = new FundFacade();
        facade.buyAll(120);
        facade.buyStockA(50);
        facade.sellAll(80);
    }
}
