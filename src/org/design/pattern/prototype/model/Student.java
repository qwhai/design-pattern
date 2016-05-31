package org.design.pattern.prototype.model;

/**
 * <p>
 * 学生类，用于实验的主体
 * </p>
 * 2016年3月3日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class Student extends People implements PrototypeCloneable {

    public Student(String _name) {
        super(_name);
    }

    private Friends friends = null;
    
    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }
    
    public void addFriend(People people) {
        if (friends == null) {
            friends = new Friends();
        }
        friends.addFriend(people);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.friends = (Friends) this.friends.clone();
        return student;
    }
}
