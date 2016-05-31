package org.design.pattern.prototype2;

public class Template extends Human {

    public Template() {
        setName("Bob");
        setAge(18);
        setSex(Sex.MALE);
        addSchools("School-A");
        addSchools("School-B");
        addSchools("School-C");
        addSchools("School-D");
        addSchools("School-E");
        addSchools("School-F");
    }
}
