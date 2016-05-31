package org.design.pattern.prototype.model;

public class People {

    private String name = null;

    public People(String _name) {
        this.name = _name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
