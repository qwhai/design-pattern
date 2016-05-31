package org.design.pattern.bridge;

/**
 * <p>
 * 抽象的咖啡类
 * </p>
 * Create Date: 2016年3月17日
 * Last Modify: 2016年3月30日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.2
 */
public abstract class Coffee {
    
    protected Addable addable = null;
    
    public Coffee(Addable _addable) {
        this.addable = _addable;
        adding();
    }
    
    private void adding() {
        if (addable != null) {
            addable.adding();
        }
    }
    
    public abstract void brewing();
    
    public abstract void showCapacity();
    
    public abstract void showAddable();
}