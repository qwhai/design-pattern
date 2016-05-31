package org.design.pattern.prototype.client;

import org.design.pattern.prototype.model.People;
import org.design.pattern.prototype.model.Student;

/**
 * <p>
 * 原型模式的测试类
 * </p>
 * 2016年3月3日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {
//        {
//            Student student1 = new Student("小明");
//            student1.addFriend(new People("小红"));
//            student1.addFriend(new People("小梅"));
//            
//            Student student2 = (Student) student1.clone();
//            
//            System.out.println("初始的List对象：");
//            System.out.println("s1.friends: " + student1.getFriends());
//            System.out.println("s2.friends: " + student2.getFriends());
//            System.out.println();
//            
//            System.out.println("不改变List对象：");
//            student2.addFriend(new People("小刚"));
//            System.out.println("s1.friends: " + student1.getFriends());
//            System.out.println("s2.friends: " + student2.getFriends());
//            System.out.println();
//            
//            System.out.println("重新对List对象赋值：");
//            student2.setFriends(null);
//            System.out.println("s1.friends: " + student1.getFriends());
//            System.out.println("s2.friends: " + student2.getFriends());
//            System.out.println();
//        }
        
        pressureTesting();
    }
    
    public static void pressureTesting() throws CloneNotSupportedException {
        int times = 100000000;
        Student student = new Student("小明");
        student.addFriend(new People("Friend-A"));
        student.addFriend(new People("Friend-B"));
        student.addFriend(new People("Friend-C"));
        student.addFriend(new People("Friend-D"));
        student.addFriend(new People("Friend-E"));
        
        long startStamp = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
           student.clone();
        }
        long currentStamp = System.currentTimeMillis();
        System.out.println("TIME USED: " + (currentStamp - startStamp) + " ms");
        
        startStamp = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            Student student2 = new Student("小红");
            student2.addFriend(new People("Friend-A"));
            student2.addFriend(new People("Friend-B"));
            student2.addFriend(new People("Friend-C"));
            student2.addFriend(new People("Friend-D"));
            student2.addFriend(new People("Friend-E"));
        }
        currentStamp = System.currentTimeMillis();
        System.out.println("TIME USED: " + (currentStamp - startStamp) + " ms");
    }
}
