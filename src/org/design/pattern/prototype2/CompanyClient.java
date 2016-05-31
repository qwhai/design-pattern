package org.design.pattern.prototype2;

public class CompanyClient {

    private static Human[] GETTER = {
            new Male(),
            new Female(),
            new Template()
    };
    
    @SuppressWarnings("unused")
    private static final int MALE = 0;
    @SuppressWarnings("unused")
    private static final int FEMAIE = 1;
    private static final int TEMPLATE = 2;
    
    public static void main(String[] args) throws CloneNotSupportedException {
//        Human human = new Male();
//        human.setName("Bob");
//        human.setAge(18);
//        human.addSchools("School-A");
//        human.addSchools("School-B");
//        human.addSchools("School-C");
//        System.out.println(human);
//        
//        Human human2 = (Human) human.clone();
//        human2.setName("Alice");
//        human2.setSex(Sex.FEMALE);
//        human2.setAge(17);
//        human2.addSchools("School-D");
//        System.out.println(human.getSchools());
//        System.out.println(human2.getSchools());
        
        pressureTesting();
    }
    
    public static void pressureTesting() throws CloneNotSupportedException {
        int times = 100000000;
        long startStamp = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            GETTER[TEMPLATE].clone();
        }
        long currentStamp = System.currentTimeMillis();
        System.out.println("TIME USED: " + (currentStamp - startStamp) + " ms");
        
        startStamp = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            @SuppressWarnings("unused")
            Human human = new Template();
        }
        currentStamp = System.currentTimeMillis();
        System.out.println("TIME USED: " + (currentStamp - startStamp) + " ms");
        
        startStamp = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            Human human = new Human();
            human.setName("Bob");
            human.setAge(18);
            human.setSex(Sex.MALE);
            human.addSchools("School-A");
            human.addSchools("School-B");
            human.addSchools("School-C");
            human.addSchools("School-D");
            human.addSchools("School-E");
            human.addSchools("School-F");
        }
        currentStamp = System.currentTimeMillis();
        System.out.println("TIME USED: " + (currentStamp - startStamp) + " ms");
    }
}
