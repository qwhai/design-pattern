package org.design.pattern.adapter2;

public class WorldOfWarcraft {

    public static void main(String[] args) {
        
        System.out.println("\n-------------------- 近卫军团的任务 --------------------");
        KonoeHero konoeHero = new Traxex();
        konoeHero.attackFrozenThrone();
        konoeHero.protectWorldTree();
        
        System.out.println("\n-------------------- 天灾军团的任务 --------------------");
        DisasterHero disasterHero = new Mercurial();
        disasterHero.protectFrozenThrone();
        disasterHero.attackWorldTree();
        
        System.out.println("\n-------------------- 适配器做了这样一件事 --------------------");
        DisguiserAdapter adapter = new DisguiserAdapter(new Traxex());
        adapter.attackWorldTree();
        adapter.protectFrozenThrone();
        
        System.out.println("\n-------------------- 适配器做了这样一件事 --------------------");
        DisguiserAdapter2 adapter2 = new DisguiserAdapter2();
        adapter2.attackWorldTree();
        adapter2.protectFrozenThrone();
    }
}
