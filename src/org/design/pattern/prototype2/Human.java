package org.design.pattern.prototype2;

import java.util.ArrayList;
import java.util.List;

public class Human implements Cloneable {

    private String name = null;
    private int age = 0;
    private Sex sex = null;
    private List<String> schools = null;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    protected void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public Sex getSex() {
        return sex;
    }
    
    public void addSchools(String school) {
        if (schools == null) {
            schools = new ArrayList<String>();
        }
        
        schools.add(school);
    }
    
    public List<String> getSchools() {
        return schools;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "{ name: " + name + ", age: " + age + ", schools: " + schools + " } - [ " + super.toString() + " ]";
    }
}
