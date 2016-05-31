package org.design.pattern.proxy.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * 学生的代理类
 * </p>
 * 2015年12月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/
 *      lemon_tree12138</a>
 * @version 0.1
 */
public class StudentProxy implements Student {

    private Student student = null;

    public StudentProxy(Student _student) {
        student = _student;
    }

    @Override
    public void examinate() {
        student.examinate();
    }

    @Override
    public void announce() {
        student.announce();
    }

    public void cheat() throws ClassNotFoundException, NoSuchMethodException,
            SecurityException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Class<?> clazz = Class.forName(student.getClass().getName());
        Method method = clazz.getDeclaredMethod("cheat");
        method.setAccessible(true);
        method.invoke(student);
    }
}
