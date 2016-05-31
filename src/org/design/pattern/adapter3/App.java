package org.design.pattern.adapter3;

/**
 * 这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 */
public class App {
    
    public static void main(String[] args) {
        // 没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getMobileNumber();
        
        System.out.println();
        //
        youngGirl = new OuterUserInfo();
        youngGirl.getMobileNumber();
    }
}