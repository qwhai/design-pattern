package org.design.pattern.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 某一学生对象的朋友类
 * </p>
 * 2016年3月3日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class Friends implements PrototypeCloneable {

    private List<People> friends = null;
    
    public List<People> getFriends() {
        return friends;
    }
    
    public void setFriends(List<People> friends) {
        this.friends = friends;
    }
    
    public void addFriend(People people) {
        if (this.friends == null) {
            friends = new ArrayList<>();
        }
        this.friends.add(people);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return friends.toString();
    }
}
