package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior() {
        health = 100;
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
        magicAtt = 0;

    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health= hero.health-((this.physAtt - this.physAtt*hero.physDef/100));
    if (hero.health<=0) hero.health = 0;
    if (hero.health>100) hero.health = 100;
    }


    @Override
    public String toString() {
        return "Warrior health= " + health;
    }
}
