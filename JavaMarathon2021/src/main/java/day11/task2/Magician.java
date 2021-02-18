package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician() {
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }
    public void physicalAttack(Hero hero) {
        hero.health= hero.health-((this.physAtt-this.physAtt*hero.physDef/100));
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - ((this.magicAtt-this.magicAtt*hero.magicDef/100));
        if (hero.health<=0) hero.health = 0;
        if (hero.health>100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Magician health= " + health;
    }
}
